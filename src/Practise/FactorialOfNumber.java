package Practise;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void generateFactorial()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
	
		generateFactorial();
	}

}
