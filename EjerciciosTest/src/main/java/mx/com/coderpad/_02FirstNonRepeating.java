package mx.com.coderpad;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

class CountIndex
{
    int count,index;
     
    // constructor for first occurrence
    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }
     
    // method for updating count
    public void incCount() {
        this.count++;
    }
}

public class _02FirstNonRepeating {
	static TreeMap<Character,CountIndex> hm = new TreeMap<Character,CountIndex>();
	
	public static void main(String[] varargs){
		String str="A3AT3N1001";
		
		int index = getFirstNonRepeated(str);
		
		if(index == Integer.MAX_VALUE) 
			System.out.println("String is empty or all characters are repeated");
		else 
			System.out.println(str.charAt(index));
	}
	
	static int getFirstNonRepeated(String str){
		int result=Integer.MAX_VALUE;
		countCharacters(str);
		
		for(int i=0;i<=str.length()-1;i++){
			if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index){
				result=hm.get(str.charAt(i)).index;
			}
		}
		return result;
	}
	
	static void countCharacters(String str){
		for(int i=0;i<=str.length()-1;i++){
			//Check if map contains the character
			if(hm.containsKey(str.charAt(i))){
				hm.get(str.charAt(i)).incCount();
			}
			else{ // is the first occurence
				hm.put(str.charAt(i), new CountIndex(i));
			}
		}
	}
}
