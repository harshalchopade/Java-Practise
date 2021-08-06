package Practise;

import java.util.Random;

public class GenerateRandomNumberAndString {
	
	public static void generateRandomIntNumber()
	{
		
		Random random = new Random();
		int a = random.nextInt();
		System.out.println(a);
	}

	public static void generateRandomDoubleNumber()
	{
		
		Random random = new Random();
		double a = random.nextDouble();
		System.out.println(a);
	}
	public static void main(String[] args) {
		generateRandomIntNumber();
	}

}
