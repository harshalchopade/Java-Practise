package Practise;

import java.util.HashSet;
import java.util.Iterator;

public class ElementNotPresentInArray {

	public static void findMissingNumberFromArray1(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = 0; j < b.length; j++)
				if (a[i] == b[j])
					break;

			if (j == b.length)
				System.out.print(a[i] + " ");
		}
	}

	public static void findMissingNumberFromArray2(int[] a, int[] b) {
		{
// Store all elements of
// second array in a hash table
			HashSet<Integer> s = new HashSet<>();
			for (int i = 0; i < b.length; i++)
				s.add(b[i]);

// Print all elements of first array
// that are not present in hash table
			for (int i = 0; i < a.length; i++)
				if (!s.contains(a[i]))
					System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 4, 5 };
		int b[] = { 3, 2, 1, 0, 5 };
		findMissingNumberFromArray1(a, b);
	}
}
