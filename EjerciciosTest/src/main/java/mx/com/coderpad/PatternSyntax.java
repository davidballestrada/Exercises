package mx.com.coderpad;

import java.util.Stack;

public class PatternSyntax {

	public static void main(String[] args) {
		
		String strPrueba="([a-z](.j))";
        System.out.println(isValid(strPrueba.toCharArray()));
	}
	
   public static boolean isMatching(char a, char b){
	   if(a=='(' && b==')') return true;
	   else if(a=='[' && b==']') return true;
	   else return false;
   }
   public static boolean isValid(char[] strPrueba){
	   Stack st = new Stack();
	   for(char cChar:strPrueba){
		   if(cChar=='(' || cChar=='[') st.push(cChar);
		   if(cChar==')' || cChar==']'){
			   if(st.isEmpty()) return false;
			   else if(!isMatching((char)st.pop(),cChar)) return false;   
		   }
	   }
	   if(st.isEmpty()) return true;
	   else return false;
   }
}
