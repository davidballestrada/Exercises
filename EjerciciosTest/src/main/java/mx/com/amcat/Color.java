package mx.com.amcat;

public class Color {
	
	public static void printColor(int num) {
		switch (num) {
		case 1:
			System.out.println("Red");	
			//break;
		case 2:
			System.out.println("Black");
			//break;
		case 3:
			System.out.println("White");
			//break;
		case 4: 
			System.out.println("Green");
			//break;
		default:
			System.out.println("No color");
			break;
		}
	}
	
	public static void main(String[] args) {
		printColor(3);
	}
}