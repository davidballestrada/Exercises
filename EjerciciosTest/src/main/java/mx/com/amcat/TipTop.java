package mx.com.amcat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TipTop {

	static final Integer i1 = 1;
	final Integer i2 = 2;
	Integer i3 = 3;
	
	public static void main(String[] args) {
		String a = "asdf b c ddfdfd e";
		String b = "b c";
		
		missingWords(a, b);
		
		System.out.println(missingWords(a, b));
	}
	
    public static List<String> missingWords(String s, String t) {
    // Write your code here
    	String[] arrS = s.split(" ");
    	String[] arrT = t.split(" ");
    	
    	List<String> listS = new ArrayList<String>(Arrays.asList(arrS));
    	List<String> listT = new ArrayList<String>(Arrays.asList(arrT));
    	
    	List<String> result = new ArrayList<String>();
    	
    	for(String item : listS) {
    		if(!listT.contains(item)) {
    			result.add(item);
    		}
    	}
    	
    	
    	return result;
    }
	
}
