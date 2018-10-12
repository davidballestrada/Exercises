package mx.com.amcat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjerciciosCordepad {
	
	public static char findFirst(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < input.length(); i++) {
			if(map.containsKey(input.charAt(i)))
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			else
				map.put(input.charAt(i), 1);
		}
		
		for(int i = 0; i < input.length(); i++) {
			if(map.get(input.charAt(i)) == 1) 
				return input.charAt(i);
		}
		
		return 0;
	}
	
	public static boolean doTestPass2() {
		String[] inputs = {"apple", "racecars", "ababdc", "aabb"};
		char[] outputs = {'a', 'e', 'd', 0};
		
		boolean result = true;
		for(int i = 0; i < inputs.length; i++) {
			result = result && findFirst(inputs[i]) == outputs[i];
			if(!result)
				System.out.println("Test failed for: " + inputs[i]);
			else
				System.out.println("Test passed for: " + inputs[i]);
		}
		return result;
	}
	
	public static int[] addFractions(int[] fraction1, int[]fraction2) {
		int num1 = fraction1[0];
		int den1 = fraction1[1];
		
		int num2 = fraction2[0];
		int den2 = fraction2[1];
		
		
		int denResult = den1 * den2;
		int numResult = (den2 * num1) + (den1 * num2);
		
		int[]result = new int[2];
		
		result[0] = numResult;
		result[1] = denResult;
		
		result = simplifyResult(result);
			
		return result;
	}
	
	public static int[] simplifyResult(int[] fraction) {
		int num = fraction[0];
		int den = fraction[1];
		
		int startDiv;
		
		if(num <= den)
			startDiv = num;
		else
			startDiv = den;
		
		for(int div = startDiv; div > 0; div--) {
			if(num % div == 0 && den % div == 0) {
				num = num/div;
				den = den/div;
				fraction[0] = num;
				fraction[1] = den;
				return fraction;
			}
		}
		return fraction;
	}
	
	public static boolean doTestPast() {
		int[] result = addFractions(new int[] {1, 7}, new int[] {1, 14});
		
		if(result[0] == 3 && result[1] == 14) {
			System.out.println("Test passed.");
			return true;
		} else {
			System.out.println("Test failed.");
			return false;
		}
	}
	
	public static void main(String[] args) {
		doTestPass2();
	}
}
