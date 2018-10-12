package mx.com.coderpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exercises {

	public static int whoIsElected(int n, int k){
		List<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) 
			list.add(i);
				
		int countTotal = 0;
		int index = -1;
		
		while(list.size() > 1) {
			countTotal++;
			index++;
			
			if(countTotal % k == 0) {
				list.remove(index);
				index--;
			}
			
			if(index == (list.size() - 1))
				index = -1;
		}
		
		return list.get(0);
	}
	
	
	
	public static boolean doTestPass() {
		int[][] testCases = {
				{1, 1, 1},
				{2, 2, 1},
				{4, 2, 1},
				{100, 2, 73},
		};
		
		for(int[] testCase : testCases) {
			int answer = whoIsElected(testCase[0], testCase[1]);
			if(answer != testCase[2]) {
				System.out.println("test failed!");
				//System.out.println("n:%d, K%d, answer got: %d, should be: %d\n", testCase[0], testCase[1], answer, testCase[2]);
				
				return false;
			}
		}
		System.out.println("All tested passed");
		return true;
	}
	
	public static void main(String[] args) {
		//doTestPass();
		
		//System.out.println(whoIsElected(8, 2));
		
		
		int[] input = { 2, 4, 3, 5, 1 };
		
		checkCombination(input, 6);
	}
	
	public static void checkCombination(int[] input, int sum) {
		/*for (int i = 0; i < input.length; i++) {
		    for (int j = 0; j < input.length; j++) {
		        if (j != i && (input[i] + input[j]) == sum) {
		            System.out.println("Combination: " + input[i] + ", " +input[j]);
		        }
		    }
		}
		*/
		
		Map<Integer, Integer> pairs = new HashMap<>();
		for (int i : input) {
		    if (pairs.containsKey(i)) {
		        if (pairs.get(i) != null)            
		            System.out.println("Combination: " + i + ", " + (sum-i));
		        pairs.put(sum - i, null);
		    } else 
		    	if (!pairs.containsValue(i)) {        
		    		pairs.put(sum-i, i);
		    }
		}
	}
}