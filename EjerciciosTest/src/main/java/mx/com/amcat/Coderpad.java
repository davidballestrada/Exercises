package mx.com.amcat;

import java.util.HashMap;
import java.util.Map;

public class Coderpad {
	
	public static int[] addFractions(int[] fraction1, int[]fraction2) {
		int num1 = fraction1[0];
		int den1 = fraction1[1];
		
		int num2 = fraction2[0];
		int den2 = fraction2[1];
		
		int[] result = new int[2];
		
		result[1] = den1 * den2;
		result[0] = (den2 * num1) + (den1 * num2);
		
		return simplifyFraction(result);
	}
	
	public static int[] simplifyFraction(int[] fraction) {
		int minFracc;
		
		if(fraction[0] < fraction[1]) {
			minFracc = fraction[0];
		} else {
			minFracc = fraction[1];
		}
		
		for(int maxDiv = minFracc; maxDiv > 0; maxDiv--) {
			if(fraction[0] % maxDiv == 0 && fraction[1] % maxDiv == 0) {
				fraction[0] = fraction[0] / maxDiv;
				fraction[1] = fraction[1] / maxDiv;
				return fraction;
			}
		}
		
		return fraction;
	}

	public static boolean doTestPass() {
		/*
		int[] result = addFractions(new int[] {2, 3}, new int[] {1, 2});
		
		if(result[0] == 7 && result[1] == 6) {
			System.out.println("Test passed.");
			return true;
		} else {
			System.out.println("Test failed.");
			return false;
		}
		*/
		
		/*
		int[] result = addFractions(new int[] {1, 10}, new int[] {1, 20});
		
		if(result[0] == 3 && result[1] == 20) {
			System.out.println("Test passed.");
			return true;
		} else {
			System.out.println("Test failed.");
			return false;
		}
		*/
		
		int[] result = addFractions(new int[] {8, 16}, new int[] {1, 2});
		
		if(result[0] == 1 && result[1] == 1) {
			System.out.println("Test passed.");
			return true;
		} else {
			System.out.println("Test failed.");
			return false;
		}
	}
	
	public static char findFirst2(String input) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < input.length(); i++) {
			if(map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < input.length(); i++) {
			if(map.get(input.charAt(i)) == 1) {
				return input.charAt(i);
			}
		}
		
		return 0;
	}
	
	private static char findFirst(String inputString) {
		char[] theString = inputString.toCharArray();		
		
		for (int j = 0; j < theString.length; j++) {
			int count = 0;
			for (int x = 0; x < theString.length; x++) {
				if(theString[j]==theString[x])
					count++;
			}
			if(count==1)
				return theString[j];
			
		}
		return 0;
	}
	
	public static boolean doTestPass2() {
		String[] inputs = {"apple", "racecars", "ababdc", "aabb", "asdfarsdxf"};
		char[] outputs = {'a', 'e', 'd', 0, 'r'};
		
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
	
	public static void main(String[] args) {
		doTestPass2();
	}
}
