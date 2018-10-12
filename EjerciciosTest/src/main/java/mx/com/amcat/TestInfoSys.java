package mx.com.amcat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TestInfoSys {

	
	
	public static Map<String,String> getCustomerData( Map<String, Map<String,String>> mpMaps) {
		
		List<String> keys = new ArrayList<>();
		
		
		
		
		keys.add("150");
		
		keys.add("100");
		
		keys.add("2");
		
		//Collections.sort(keys);
		
		for(String item : keys) {
			System.out.println(item);	
		}
		
		
		
		
		
		
		
		/*
		for(String item : keys) {
			if(mpMaps.containsKey(item))
			{
				Map subMap = mpMaps.get(item);
				
				//if(subMap.containsKey(key)) {
					
				//}
			}
		}
		*/
		
		
		
		//String value = mpMaps.get(key)
		
		return null;
	}
	
	public static void main(String args[]) {
		getCustomerData(null);
		
		
	}


	
}