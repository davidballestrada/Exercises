package mx.com.coderpad;

import java.util.StringTokenizer;

public class TokenizerSimple {
int i = 0;
	public static void main(String[] args) {
		/*String arr = "He is a very very good boy, isn't he?";
		StringTokenizer strTokens= new StringTokenizer(arr," ,'?");
		//System.out.println(strTokens.countTokens());
		//while(strTokens.hasMoreTokens()){
			//System.out.println(strTokens.nextToken());			
		//}
    
		try {
			System.out.print("2");
		} finally {
			System.out.println("3");
		}*/
		
		int i = 1;
		
		met(i);
		System.out.println(i);
		
		String a = "abcd";
		String s = new String("abcd");
		
		System.out.println(a.equals(s));
	}
	public static void met(int i) {
		i = 2;
		i *= 2;
	}

}
