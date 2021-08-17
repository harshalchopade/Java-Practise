package Practise;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumberAndString {

	public static void generateRandomIntNumber() {

		Random random = new Random();
		int a = random.nextInt();
		System.out.println(a);
	}

	public static void generateRandomDoubleNumber() {

		Random random = new Random();
		double a = random.nextDouble();
		System.out.println(a);
	}

	// Using Random Class
	public static void generateRandomValues() {
		Random random = new Random();
		for (int i = 0; i <= 5; i++) {
			System.out.println(random.nextInt());
			System.out.println(random.nextDouble());
			System.out.println(random.nextFloat());
			System.out.println(random.nextBoolean());
		}
	}

	// Using Math Class
	public static void generateRandomValuesUsingMath() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Math.random());
		}
	}

	// Using ThreadLocal Class
	public static void generateRandomValuesUsingThreadRandom() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
			System.out.println(ThreadLocalRandom.current().nextDouble());
			System.out.println(ThreadLocalRandom.current().nextFloat());
			System.out.println(ThreadLocalRandom.current().nextBoolean());

		}
	}

	public static void main(String[] args) {
		generateRandomIntNumber();
	}

}
