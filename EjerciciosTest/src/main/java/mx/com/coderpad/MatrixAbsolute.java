package mx.com.coderpad;

public class MatrixAbsolute {
	public static void main(String[] varargs){
		int[][] va ={{11,2,4},{4,5,6},{10,8,-12}};
		
		int abs=dagonalAbsolute(va);
		System.out.println(abs);
	}
	
	static int dagonalAbsolute(int[][] arr){
		int absolute=0;
		
		int suma=0;
		int sumb=0;
		int diaga=0;
		int diagb=arr[0].length-1;
		for(int ih=0,iv=0;ih<=arr[0].length-1;ih++,iv++,diagb--){
			suma+=arr[ih][iv];
			sumb+=arr[ih][diagb];
		}
		System.out.println("suma: " + suma);
		System.out.println("sumb: " + sumb);
		absolute =suma-sumb;
		return (absolute<0)?absolute*(-1):absolute;
		
	}
}
