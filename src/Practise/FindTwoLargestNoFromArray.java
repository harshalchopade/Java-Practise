package Practise;

public class FindTwoLargestNoFromArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			if (max1 < no) {
				max2 = max1;
				max1 = no;
			} else if (max2 < no) {
				max2 = no;
			}
		}
		System.out.println(max1 + " " + max2);
	}

}
