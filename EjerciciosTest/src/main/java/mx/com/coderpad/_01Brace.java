package mx.com.coderpad;

import java.util.Stack;

public class _01Brace {
	public static void main(String[] varargs){
		//String strInput="(a+a)";
		String strInput="{[]([])}";
		
		if(isBalanced(strInput.toCharArray())) 
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
	
	private static boolean isBalanced(char[] exp) {
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i <= exp.length - 1; i++) {
			if (exp[i] == '(' || exp[i] == '[' || exp[i] == '{')
				st.push(exp[i]);
			if (exp[i] == ')' || exp[i] == ']' || exp[i] == '}')
				if (st.isEmpty())
					return false;
				else
					if (!matchPair((char)st.pop(), exp[i]))
						return false;
		}

		if (st.isEmpty())
			return true;
		else
			return false;

	}
	
	private static boolean matchPair(char character1, char character2){
		if (character1=='(' && character2==')')
			return true;
		else 
			if(character1=='[' && character2==']')
				return true;
			else 
				if(character1=='{' && character2=='}')
					return true;
		else 
			return false;
	}
}
