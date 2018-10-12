package mx.com.coderpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _03FormLargestNumber {

	public static void main(String[] args) {
		
		String[] lista = {"54","95","548","60"};
		System.out.println(lista);
	    System.out.println(getMaximum(lista));

	}

	public static StringBuilder getMaximum(String[] nums){
		StringBuilder strMax =new StringBuilder();
				
		Arrays.sort(nums, new Comparator<String>(){
			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
			
		});
		
		for(String str:nums){
			strMax.append(str);
		}
		
		return strMax;
	}
		
}

