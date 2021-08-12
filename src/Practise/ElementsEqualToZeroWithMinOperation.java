package Practise;

public class ElementsEqualToZeroWithMinOperation {

	static int minimumChanges(int arr[], int n) {
		int i;
		int changes = 0;

		for (i = 0; i < n; i++) {
			// Check for the first 1
			if (arr[i] == 1) {
				int j;
				for (j = i + 1; j < n; j++) {
					if (arr[j] == 0)
						break;
				}

				i = j - 1;

				changes++;
			}
		}

		return changes;
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 1, 1, 10, 1 };
		int n = arr.length;

		System.out.println("Minimum operations: " + minimumChanges(arr, n));

	}
}
