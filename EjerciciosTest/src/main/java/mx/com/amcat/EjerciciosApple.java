package mx.com.amcat;

import java.util.HashMap;
import java.util.Map;

public class EjerciciosApple {

	public static void main(String[] args) {
		Integer[] array = {3, 4, 6, 8, 1, 6, 2, 7, 3};
		
		System.out.println(getMax(array));
		System.out.println(getNextMax(array));
		System.out.println(getFirstDuplicate(array));
	}
	
	public static Integer getNextMax(Integer[] array) {
		if(array == null)
			return null;
		
		if(array.length == 0)
			return null;
					
		if(array.length == 1)
			return array[0];
		
		Integer max;
		Integer nextMax;
		
		if(array[0] > array[1]) {
			max = array[0];
			nextMax = array[1];
		} else {
			max = array[1];
			nextMax = array[0];
		}
			
		for(int i = 2; i < array.length; i++) {
			if(array[i] > max) {
				nextMax = max;
				max = array[i];
			} else
				if(array[i] > nextMax)
					nextMax = array[i];
		}
		
		return nextMax;
	}
	
	public static Integer getMax(Integer[] array) {
		if(array == null)
			return null;
		
		if(array.length == 0)
			return null;
					
		if(array.length == 1)
			return array[0];
		
		Integer max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		
		return max;
	}
	
	public static Integer getFirstDuplicate(Integer[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i]))
				return array[i];
			else
				map.put(array[i], 1);
		}
		
		return null;
	}
	
	
}
