package mx.com.coderpad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HackerRankTaylor {

	private static final Scanner scanner = new Scanner(System.in);
	
	private static String[] braces2(String[] values) {
		String[] result = new String[values.length];
		char previousChar = '.';
		char currentChar = '.';

		List<Character> brackets;

		for (int i = 0; i < values.length; i++) {
			brackets = new ArrayList();

			for (int j = 0; j < values[i].length(); j++) {
				currentChar = values[i].charAt(j);

				if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
					previousChar = currentChar;
					brackets.add(currentChar);
				} else {
					switch (currentChar) {
					case '}':
						if (previousChar == '{') {
							brackets.remove(brackets.size() - 1);
							previousChar = brackets.get(brackets.size() - 1);
						}
						break;
					case ']':
						if (previousChar == '[') {
							brackets.remove(brackets.size() - 1);
							brackets.get(brackets.size() - 1);
						}
						break;
					case ')':
						if (previousChar == '(') {
							brackets.remove(brackets.size() - 1);
							brackets.get(brackets.size() - 1);
						}
						break;
					default:
						break;
					}
				}

			}
			if (brackets.isEmpty()) {
				result[i] = "YES";
			} else
				result[i] = "NO";

		}

		return result;
    }
	
	private static void getMerged4(int[] a, int[] b, int M){
		int indexArray1 = 0;
		
		for(int i = M; i < M*2; i++) {
			b[i] = a[indexArray1];
		}
			
		b = sortArray(b);
		

		
		/*int[] arrayNoCero = new int[M*2];
		
		for(int i = 0; i < b.length; i++) {
			if(b[i] != 0)
				arrayNoCero[i] = b[i];
		}
		
		b = arrayNoCero;
		*/
		System.out.println(Arrays.toString(b));
		
		
	}
	
	private static int divide(int a, int b) {
		int c = -1;
		try {
			c = a / b;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("Exception ");
		} finally {
			System.err.println("Finally ");
		}
		
		return c;
	}
	
	public static void add(int a) {
		loop: for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 3; j++) {
				if(a == 5) {
					break loop;
				}
				System.out.println(i * j);
			}
		}
	}
	

	/*
	static void mergeArray(int []a, int []b, int M ){
        List<Integer> listArray1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listArray2 = Arrays.stream(b).boxed().collect(Collectors.toList());
        

        
        listArray2.addAll(listArray1);
        
        Collections.sort(listArray2);
        
        System.out.println(listArray2);
 
	}*/
	
	/*
	private static void getMerged5(int[] array1, int[] array2){
		List<Integer> listArray1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
		List<Integer> listArray2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
		
		
		int[] arrayAux = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++) {
			arrayAux[i] = array2[i];
		}
		
		//List<Integer> listArray2 = Arrays.stream(arrayAux).boxed().collect(Collectors.toList());
		
		listArray2.addAll(listArray1);
		
		Collections.sort(listArray2);
		
		System.out.println("Merged2 " + listArray2);
	}*/
	

	private static boolean isBalanced2(char[] expr) {
		Stack<Character> stackChar = new Stack<Character>();
		
		for(int i = 0; i < expr.length; i++) {
			if(open(expr[i])) {
				stackChar.push(expr[i]);
				continue;
			}
			if(close(expr[i]))
				if(stackChar.isEmpty())
					return false;
				else
					if (!matches((char)stackChar.pop(), expr[i]))
						return false;
					//else
						//return
			//para descartar otros caracteres
			/*if(!open(expr[i]) && !close(expr[i])) {
				return false;
			}*/
		}
		
		return stackChar.isEmpty();
	}
	

	
	
	
	
	
	
	private static void getMerged(Integer[] array1, Integer[] array2) {
		List<Integer> intArray1 = new ArrayList<Integer>(Arrays.asList(array1));
		List<Integer> intArray2 = new ArrayList<Integer>(Arrays.asList(array2));
		
		intArray2.addAll(intArray1);
	
		Collections.sort(intArray2);
		
		System.out.println("Merge 1" + intArray2);
	}
	
	/*
	private static void getMerged2(int[] array1, int[] array2){
		List<Integer> listArray1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
		
		int[] arrayAux = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++) {
			arrayAux[i] = array2[i];
		}
		
		List<Integer> listArray2 = Arrays.stream(arrayAux).boxed().collect(Collectors.toList());
		
		listArray2.addAll(listArray1);
		
		Collections.sort(listArray2);
		
		System.out.println("Merged2 " + listArray2);
	}*/
	
	private static void getMerged8(int[] array1, int[] array2, int M) {
		
		
		
	}

	
	private static int[] getMerged3(int[] array1, int[] array2){
		int indexArray1 = 0;
		
		for(int i = 0; i < array2.length; i++) {
			if(array2[i] == 0) {
				array2[i] = array1[indexArray1];
				indexArray1++;
			}
		}
		
		return sortArray(array2);
	}
	

	public static void main(String[] args) throws IOException {
		/*
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int valuesCount = scanner.nextInt();
		
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		String[] values = new String[valuesCount];
		
		for(int i=0; i< valuesCount; i++) {
			String valuesItem = scanner.nextLine();
			values[i] = valuesItem;
		}
		
		String[] res = braces(values);
		
		for(int i = 0; i<res.length; i++) {
			bufferedWriter.write(res[i]);
			
			if(i != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}
		
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
		*/
		
		/*String stringExpr = "{[]([])(){}}";

		if(isBalanced(stringExpr.toCharArray()))
			System.out.println("YES");
		else
			System.out.println("NO");
		*/
		
		
		/*
		Integer[] arrayInteger1 = {2,3,5,6,7};
		Integer[] arrayInteger2 = {1,3,8,9,10,0,0,0,0,0};
		
		getMerged(arrayInteger1, arrayInteger2);
		
		int[] arrayInt1 = new int[5];
		int[] arrayInt2 = new int[10];
		
		arrayInt1[0] = 1;
		arrayInt1[1] = 3;
		arrayInt1[2] = 5;
		arrayInt1[3] = 7;
		arrayInt1[4] = 9;

		arrayInt2[0] = 2;
		arrayInt2[1] = 4;
		arrayInt2[2] = 6;
		arrayInt2[3] = 8;
		arrayInt2[4] = 10;
		
		getMerged2(arrayInt1, arrayInt2);
		
		int[] arrayNotOrdered = {3,7,4,2,1,6,23,11,8};
		
		System.out.println("Sort array: " + Arrays.toString(sortArray(arrayNotOrdered)));
		
		System.out.println("Merge3: " + Arrays.toString(sortArray(getMerged3(arrayInt1, arrayInt2))));
		*/
		
		//Integer[] arrayInteger1 = {2,3,5,6,7};
		//Integer[] arrayInteger2 = {1,3,8,9,10};
		
		
		int[] arrayInt1 = new int[5];
		int[] arrayInt2 = new int[10];
		
		arrayInt1[0] = 1;
		arrayInt1[1] = 3;
		arrayInt1[2] = 5;
		arrayInt1[3] = 7;
		arrayInt1[4] = 9;

		arrayInt2[0] = 0;
		arrayInt2[1] = 2;
		arrayInt2[2] = 4;
		arrayInt2[3] = 8;
		arrayInt2[4] = 10;
		
		int[] arrayInt3 = new int[4];
		
		//System.out.println(Arrays.toString(arrayInt1));
		//System.out.println(Arrays.toString(arrayInt2));
		//System.out.println(Arrays.toString(arrayInt3));
		
		//getMerged(sortArray(arrayInt1), sortArray(arrayInt2), 5);
		
		String[] leng = new String[4];
		
		leng[0] = "{{}{{}}f[][]}f";
		leng[1] = "{}f({)}";
		leng[2] = "(f{{}})[]{asd}()";
		leng[3] = "{{{}d}{)d";
		
		//System.out.println(Arrays.toString(braces(leng)));
		
		//System.out.println(Arrays.toString(mergeArray(arrayInt1, arrayInt2, 5)));
		
		String info = "It is a pleasant day today";
		//String info = "hey";
		System.out.println(longestEvenWord(info));
		
		//

		Scanner sc = new Scanner(System.in);
		int _a_cnt = 0;
		int[] _a = new int[100001];
		int[] _b = new int[200002];
		
		try {
			_a_cnt = sc.nextInt();
		}catch (Exception e) {
			 System.out.println("Here: " + e.getMessage()); 
		} 

for( int i = 0;i < _a_cnt;i++ ){			_a[i] = sc.nextInt();		
	}
	for( int i = 0;i < _a_cnt;i++ ){
			_b[i] = sc.nextInt();		
		}	
		mergeArray(_a ,_b,_a_cnt);
		for( int i = 0;i < 2 * _a_cnt;i++ ){
			System.out.print(_b[i] + " ");		
		}
	}
	
	


	/*
	public static void mergeArray(int[] array1, int[] array2, int m) {
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		array2 = sortArray(array2);
		
		System.out.println(Arrays.toString(array2));
	}
	*/
	
	public static String longestEvenWord(String sentence) {
	
        String[] array = sentence.split(" ");
        
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        
        Map<String, Integer> map = new TreeMap<>();
        
        for(String item : list) {
        	map.put(item, item.length());
        }
        
        //Collections.sort(list, Collections.reverseOrder());
        
        List<Integer> listNum = new ArrayList<Integer>();
        
        for(String item : list) {
        	listNum.add(item.length());
        }
        
        Collections.sort(listNum);
        
        Integer par = 0;
        
        for(Integer item : listNum) {
        	if(item % 2 == 0) {
        		par = item;
        	}
        }
        
		for(String item : list) {
			if(map.get(item) == par) 
				return item;
		}
		
		return "00";
    }
	
	public static int[] mergeArray(int[] a, int[] b, int M) {
		for(int i = 0; i < a.length; i++) {
			b[M + i] = a[i];
		}
		
		int temp;
		//b = sortArray(b);
		
		for(int i = 1; i < (M * 2); i++) {
			for(int j = i; j > 0; j--) {
				if(b[j] < b[j - 1]) {
					temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}
		
		return b;
	}
	
	private static int[] sortArray(int[] arrayNotOrder) {
		Integer temp;
		
		for(int i = 1; i < arrayNotOrder.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrayNotOrder[j] < arrayNotOrder[j - 1]) {
					temp = arrayNotOrder[j];
					arrayNotOrder[j] = arrayNotOrder[j - 1];
					arrayNotOrder[j - 1] = temp;
				}
			}
		}
		
		return arrayNotOrder;
	}
	
	private static String[] braces(String[] values) {
		String[] result = new String[values.length];
		
		for(int i = 0; i < values.length; i++) {
			if(isBalanced(values[i].toCharArray())) {
				result[i] = "YES";
			} else {
				result[i] = "NO";
			}
		}
		
		return result;
	}
	
	private static boolean isBalanced(char[] expr) {
		Stack<Character> stackChar = new Stack<Character>();
		
		for(int i = 0; i < expr.length; i++) {
			if(open(expr[i])) {
				stackChar.push(expr[i]);
				continue;
			}
			if(close(expr[i]))
				if(stackChar.isEmpty())
					return false;
				else
					if (!matches((char)stackChar.pop(), expr[i]))
						return false;
					//else
						//return
			//para descartar otros caracteres
			/*if(!open(expr[i]) && !close(expr[i])) {
				return false;
			}*/
		}
		
		return stackChar.isEmpty();
	}
	
	private static boolean matches(char char1, char char2) {
		
		switch (char1) {
		case '[':
			return char2 == ']';

		case '(':
			return char2 == ')';

		case '{':
			return char2 == '}';			
		}
		
		return false;
	}
	
	private static boolean open(char openChar) {
		return openChar == '{' || openChar == '[' || openChar == '('; 
	}
	
	private static boolean close(Character closeChar) {
		return closeChar == '}' || closeChar == ']' || closeChar == ')'; 
	}
}
