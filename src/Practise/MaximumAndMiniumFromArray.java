package Practise;

public class MaximumAndMiniumFromArray {

	public static void findMaxAndMinNumber() {
		int[] a = { 1, 2, 3, 4, 5 };

		int max = a[0];
		for (int i = 1; i <= a.length-1; i++) {
			if (a[i] > max)
				max = a[i];
		}

		System.out.println("Max element is " + max);
	}

	public static void main(String[] args) {
		findMaxAndMinNumber();
	}
}
