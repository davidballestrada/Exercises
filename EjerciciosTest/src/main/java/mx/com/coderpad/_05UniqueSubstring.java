package mx.com.coderpad;

import java.util.HashSet;
import java.util.TreeSet;

public class _05UniqueSubstring {
	public static void main(String[] varargs){
		Integer limit=2;
		String input="abdd";
		
		HashSet<String> mySet = new HashSet();
		
		for(int indice=0;indice<input.length()-2;indice++){
			TreeSet<String> strComb = new TreeSet<>();
			char c = input.charAt(indice);
			//strComb.add(arg0);
			int iSize = 1;
			for(int ia=indice+1;ia<=input.length()-2;ia++){
				if (iSize==limit){
					//mySet.add(strComb);
					iSize=1;
				}
				//if(input.charAt(indice))
			}
			
		}
	}
}
