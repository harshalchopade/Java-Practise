package Practise;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseAString {
	
	public static void approach1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = sc.next();
		String rev ="";
		for(int i=input.length()-1; i>=0;i--)
		{
			rev = rev+input.charAt(i);
		}
		System.out.println("Reverse string is "+rev);
	}
	
	public static void approach2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = sc.next();
		String rev ="";
		char ch[] = input.toCharArray();
		for(int i=ch.length-1; i>=0;i--)
		{
			rev = rev+ch[i];
		}
		System.out.println("Reverse string is "+rev);
		
	}
	
	public static void approach3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = sc.next();
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		System.out.println("Reverse string is "+sb);
		
	}

	public static void main(String[] args) 
	{
		approach1();
		approach2();
		approach3();
	}

}
