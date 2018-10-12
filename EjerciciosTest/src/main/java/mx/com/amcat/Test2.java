package mx.com.amcat;


//How does put() method of HashMap works in Java? 

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void putMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 4);
		System.out.println(map.get("key1"));
	}

	public static void main(String[] args) {
		putMap();

	}
}
