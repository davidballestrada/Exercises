package mx.com.coderpad;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamsApp {

	public static void main(String[] args) {
		String strValues = "gabo45945oba8g";
		Arrays.asList(strValues.toCharArray());
		
		Set<Character> set = new HashSet();
		//set.addAll(Arrays.asList(strValues.toCharArray()));
		
		List<String> lstValues = Arrays.asList("sd","wertr","asd","","jhsd","");
		
		List<String> filteredList = lstValues.stream().filter(x -> x.equals("asd")).collect(Collectors.toList());
		System.out.println(filteredList);
	}

}
