package Practise;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		
		int x = 10, y = 20;
		
		//Approach1 - Using temp var
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
		//Aproach2 - Without using temp var (addition and subtraction)
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
		//Aproach3 - Without using temp var(multi and division)
		x= x*y;
		y=x/y;
		x=x/y;
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
		//Approach4 - Using XOR
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
		
		//Approach5 - 
		y = x+y -(x=y);
		System.out.println("Value of x after swapping "+x);
		System.out.println("Value of y after swapping "+y);
	}
}
