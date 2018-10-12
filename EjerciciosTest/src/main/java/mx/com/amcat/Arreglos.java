package mx.com.amcat;

import java.util.Arrays;

public class Arreglos {

	
    static void mergeArray(int []a, int []b, int M ){
    
		for (int i = 0; i < a.length; i++) {
			b[M + i] = a[i];
		}

		int temp;

		for (int i = 1; i < b.length; i++) {
			for (int j = i; j > 0; j--) {
				if (b[j] < b[j - 1]) {
					temp = b[j - 1];
					b[j - 1] = b[j];
					b[j] = temp;
				}
			}
		}
		
		Vector<int, int> v = new Vector<int , int>(3);
		
	}
    
     public static void main(String[] args) {
    	 int[] arr1 = new int[10];
    	 int[] arr2 = new int[20];
    	 
    	 arr1[0] = 3;
    	 arr1[1] = 5;
    	 arr1[2] = 6;
    	 arr1[3] = 9;
    	 arr1[4] = 12;
    	 arr1[5] = 14;
    	 arr1[6] = 18;
    	 arr1[7] = 20;
    	 arr1[8] = 25;
    	 arr1[9] = 28;
    	 
    	 arr2[0] = 28;
    	 arr2[1] = 30;
    	 arr2[2] = 32;
    	 arr2[3] = 34;
    	 arr2[4] = 36;
    	 arr2[5] = 38;
    	 arr2[6] = 40;
    	 arr2[7] = 42;
    	 arr2[8] = 44;
    	 arr2[9] = 48;
    	 
    	 mergeArray(arr1, arr2, 10);
    	 
    	 System.out.println(Arrays.toString(arr2));

     }
    
}
