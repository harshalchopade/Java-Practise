package Practise;

public class PrintOddAndEvenFromArray {
	
	public static void printOddEvenFromArray(int[] noArray)
	{
		for(int no : noArray)
		{
			if(no%2 == 0)
			System.out.println("Even number is: "+no);
			else
				System.out.println("Odd number is: "+no);
		}
	}

	public static void main(String[] args) 
	{
		printOddEvenFromArray(new int[] {10,20,30,47,49,63});
	}
}
