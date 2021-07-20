package Practise;

public class StarPattern1 {

	//Pattern1
	/*Outer loop always for number of rows
	 * And inner for no of columns*/
	
	public static void simplePattern1() {

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void simplePattern2() {

		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void simplePattern3() {

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		simplePattern3();
	}
}
