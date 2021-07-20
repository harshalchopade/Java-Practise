package Practise;

public class MissingNumberInAnIntegerArray {

	public static int findMissingNumber(int[] arr, int count) {

		int expSum = count * ((count + 1) / 2);
		int actualSum = 0;
		for (int no : arr)
			actualSum += no;

		return (expSum - actualSum);
	}

	public static void main(String[] args) {
		int missingNo = findMissingNumber(new int[] { 1, 2, 3, 5 }, 5);
		System.out.println(missingNo);
	}

}
