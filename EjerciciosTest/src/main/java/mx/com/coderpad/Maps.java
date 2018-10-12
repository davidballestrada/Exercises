package mx.com.coderpad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		pruebaMaps();
		
		System.out.println("Max integer: " + Integer.MAX_VALUE);
		
		System.out.println("Min integer: " + Integer.MIN_VALUE);
		
		Integer integer = 9;
		
		System.out.println(integer);
		
	}
	
	private static void pruebaMaps() {
		Map<String,Integer> tm = new HashMap<String,Integer>();
		
		tm.put("Valor1", 2);
		tm.put("Valor2", 3);
		tm.put("Valor3", 8);
		tm.put("Valor4", 23);
		
		tm.put("Valor3", 20);
		tm.put("Valor2", 500);
		tm.put("Valor5", 15);
		tm.put("Valor5", 222);
		
		System.out.println("Size: " + tm.size());
		
		for(String key : tm.keySet()) {
			System.out.println(key + " - " + tm.get(key));
		}
		
		tm.remove("Valor3");
		System.out.println();
		for(String key : tm.keySet()) {
			System.out.println(key + " - " + tm.get(key));
		}
	}
	
	private static void pruebaCollection() {
		List<String> list = new ArrayList<String>();
		
		Collection<String> collection = new ArrayList<String>();
		
		
		
	}
	
	//private static int 

}
