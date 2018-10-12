package mx.com.coderpad;

import java.util.StringTokenizer;

public class _04Fractions {
   public static void main(String[] varargs){
	    String fraccion1="1/2";
		String fraccion2="2/4";
		
		StringTokenizer lstTokens = new StringTokenizer(fraccion1,"/");
		StringTokenizer lstTokens2 = new StringTokenizer(fraccion2,"/");
		
		System.out.println(lstTokens);
		int count=1;
		String num1="";
		String denom1="";
		
		String num2="";
		String denom2="";
		
		while(lstTokens.hasMoreTokens()){
			if(count==1) num1=lstTokens.nextToken();
			if(count==2) denom1=lstTokens.nextToken();
			count++;
		}
		count=1;
		while(lstTokens2.hasMoreTokens()){
			if(count==1) num2=lstTokens2.nextToken();
			if(count==2) denom2=lstTokens2.nextToken();
			count++;
		}
		Integer iNumerador1,iNumerador2,iDenominador1,iDenominador2;
		Integer mcd;
		
		iNumerador1=Integer.valueOf(num1);
		iNumerador2=Integer.valueOf(num2);
		iDenominador1=Integer.valueOf(denom1);
		iDenominador2=Integer.valueOf(denom2);
		
		mcd=iDenominador1*iDenominador2;
		
		Integer iResNumerador=(iNumerador1*iDenominador2)+(iDenominador1+iNumerador2);
		
		String fResultado=iResNumerador+"/"+mcd;
		System.out.println(fResultado);
		
		
		
		
   
   }
	
}
