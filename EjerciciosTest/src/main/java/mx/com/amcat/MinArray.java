package mx.com.amcat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinArray {

	public static int[] sortArray(int[] arr) {
		int temp;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j - 1]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static int findMinElement(int[] arr1, int[] arr2) {
		if(sortArray(arr1)[0] < sortArray(arr2)[0]) {
			return sortArray(arr1)[0];
		}
		return sortArray(arr2)[0];
	}
	
	public static int[] deleteDuplicate(int arr[]) {
		int count = 0, p, len = arr.length-1, i,j,k, originalLength = arr.length;
		for(i = 0; i < len; i++) {
			for(j = i + 1; j < len; j++) {
				if(arr[j] == arr[i]) {
					for(k = j; k < len; k++) {
						arr[k] = arr[k+1];
					}
					len = len-1;
					count = count + 1;
					j = i;
				}
			}
		}
		int newLength = originalLength - count;
		int newArr[] = new int[newLength];
		for(i = 0; i < newLength; i++)
			newArr[i] = arr[i];
		return newArr;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,3,5,3,1,67,9};
		
		int[] arr1 = {100,22,43,912,56,89,85};
		int[] arr2 = {234,123,456,234,890,101};

		//int[] arr1 = {2,5,1,3,9,8,4,6,5,2,3,11};
		//int[] arr2 = {11,13,2,4,15,17,67,44,2,100,23};

		
		arr = sortArray(arr);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(findMinElement(arr1, arr2));
		
		int[] arr3 = {2,2,3,3,4,4};
		//int[] arr3 = {21,21,21,21,21};
		
		//System.out.println(Arrays.toString(deleteDuplicate(arr3)));
		//System.out.println(getSum(457));
		
		int[] arr4 = {23,18,11,3};
		//System.out.println(getDigitSum(arr4));
		
		//System.out.println(posicionDigitos(3));
		
		int[] arr5 = {8,4,31,16,2};
		
		//System.out.println(generalizeGDC2(arr5));
		
		int[] arrInt = {38,4,18,8,6,4,6};
		
		List<Integer> listInteger = new ArrayList<Integer>(arrInt.length);
		
		for (int item : arrInt){
			listInteger.add(item);
		}
		
			
		//listInteger.sort(Comparator.naturalOrder());
		//listInteger.sort(Comparator.reverseOrder());
		
		/*
		listInteger.sort(null);
		listInteger.sort(Collections.reverseOrder());
		
		Collections.sort(listInteger);
		Collections.sort(listInteger, Collections.reverseOrder());
		*/
		
		//System.out.println(generalizeGDC5(arrInt));
		
		//System.out.println(2 % 2);
		
		//int[] arrAlt = {1,2,3,5,5,6,9,10};
		int[] arrAlt = {16,15,11,8,5,3,2,1,7,9};
		
		//System.out.println(Arrays.toString(findAlternativeSort3(arrAlt)));
		
		numberPatternPrint(6);
	}
	
	private static int getSum(int num) {
		int sum = 0;
		while(num != 0) {
			sum = sum + (num % 10);
			num = num/10;
		}
		return sum;
	}
	
	public static int getDigitSum(int arr[]) {
		int result = 0, len = arr.length, min = arr[0];
		for(int i = 0; i < len; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		result = getSum(min);
		if(result % 2 == 0)
			return 1;
		else
			return 0;
	}
	
	public static int posicionDigitos(int digitos) {
		int sum = 0;
		int position = 1;
		for(int i = 1; i <= digitos; i++) {
			sum = sum + position * 9;
			position = position * 10;
		}
		
		return sum;
	}
	
	public static int generalizeGDC(int arr[]) {
		arr = sortArray(arr);
		
		int min = arr[0];
		int isDiv;
		
		for(int div = min; div > 0; div--) {
			isDiv = 0;
			for(int i = 0; i < arr.length; i++) 
				if(arr[i] % div == 0)
					isDiv++;
			if(isDiv == arr.length)
				return div;
		}
		return -1;
	}
	
	public static List sortCustom(List list) {
		//list.sort(Comparator.naturalOrder());
		
		return list;
	}
	
	public static int generalizeGDC2(int arr[]) {
		List<Integer> list = new ArrayList<Integer>(arr.length);
		
		for(int item : arr) {
			list.add(Integer.valueOf(item));
		}
		
		Collections.sort(list);
		
		int min = list.get(0);
		int isDiv;
		
		for(int div = min; div > 0; div--) {
			isDiv = 0;
			for(Integer item : list) {
				if(item % div == 0) {
					isDiv++;
				}
			}
			if(isDiv == list.size()) {
				return div;
			}
		}
		return -1;
	}
	
	public static int generalizeGDC3(int arr[]) {
		List<Integer> listInteger = new ArrayList<Integer>(arr.length);
		
		for(int item : arr) {
			listInteger.add(item);
		}
		
		listInteger.sort(null);
		
		int min = listInteger.get(0);
		int isDiv;
		
		for(int maxDiv = min; maxDiv > 0; maxDiv--) {
			isDiv = 0;
			for(int item : listInteger) {
				if(item % maxDiv == 0)
					isDiv++;
			}
			if(isDiv == listInteger.size())
				return maxDiv;
		}
		
		return -1;
	}
	
	public static int generalizeGDC5(int arr[]) {
		List<Integer> listInteger = new ArrayList<Integer>(arr.length);
		
		for(int item : arr) {
			listInteger.add(item);
		}
		
		Collections.sort(listInteger);
		
		int isDiv;
		int min = listInteger.get(0);
		
		for(int div = min; div > 0; div--) {
			isDiv = 0;
			for(int item : listInteger) {
				if(item % div == 0) {
					isDiv++;
				}
			}
			if(isDiv == listInteger.size())
				return div;
		}
		
		String a = "";
		a = a.substring(2, a.length());
		
        String result = "";
        String[] arry = result.split("*");
        
		return -1;
	}
	
	public static void numberPatternPrint(int n)
	  {
	    // INSERT YOUR CODE HERE
	    
	    int count = 1;
	    int generalCount = 1;
	    //String result;
	    StringBuffer sb;
	    //sb.reverse();
	    String result;
	    for(int row = 1; row <=n; row++){
	        sb = new StringBuffer();
	              for(int col = 1; col <= count; col++){
	                sb.append(generalCount+",");
	                //System.out.print(generalCount+"*");
	                generalCount++;
	            }
	        result = sb.toString();
	        result = result.substring(0,result.length()-1);
	        sb = new StringBuffer();
	        sb.append(result);
	        
	        
	        if(row % 2 == 0){
	            //sb.reverse();
	            
	            String[] arr = result.split(",");
	            result = "";
	            
	            
	            for(int i = arr.length - 1; i >= 0; i--){
	                result += arr[i] + ",";
	            }
	            
	            
	            result = result.substring(0, result.length() - 1);
	        }
	        
	        result = result.replace(",", "*");
	        System.out.println(result);
	        count++;
	    }    
	  }
	
	public static int generalizeGDC4(int arr[]) {
		boolean gdcFound = false;
		int b = 100000;
		while(!gdcFound) {
			b--;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % b != 0) {
					gdcFound = false;
					break;
				} else {
					gdcFound = true;
				}
			}
		}
		return b;
	}
	
	public static int[] findAlternativeSort(int arr[]) {
		List<Integer> listInteger = new ArrayList<Integer>(arr.length);
		int[] result = new int[arr.length / 2];
		
		for(int item : arr) {
			listInteger.add(item);
		}
		
		Collections.sort(listInteger);
		
		int count = 0;
		int index = 0;
		for(int item : listInteger) {
			if(count % 2 == 0) {
				result[index] = item;
				index++;
			}
			count++;
		}
		
		return result;
	}
	
	public static int[] findAlternativeSort2(int arr[]) {
		List<Integer> listInteger = new ArrayList<Integer>(arr.length);
		
		int lenghtResult = arr.length / 2;
		
		if(arr.length % 2 != 0) {
			lenghtResult++;
		}
		
		int[] result = new int[lenghtResult];
		
		for(int item : arr) {
			listInteger.add(item);
		}
		
		Collections.sort(listInteger);
		
		int index = 0;
		for(int i = 0; i < listInteger.size(); i += 2) {
			result[index] = listInteger.get(i);
			index++;
		}
		
		return result;
	}
	
	public static int[] findAlternativeSort3(int arr[]) {
		List<Integer> listInteger = new ArrayList<Integer>(arr.length);
		
		for(int item : arr) {
			listInteger.add(item);
		}
		
		Collections.sort(listInteger);
		
		int lenghtValue = arr.length / 2;
		
		if(arr.length % 2 != 0) {
			lenghtValue++;
		}
		
		int[] result = new int[lenghtValue];
		
		int count = 0;
		for(int i = 0; i < listInteger.size(); i += 2) {
			result[count] = listInteger.get(i);
			count++;
		}
		
		return result;
	}
}