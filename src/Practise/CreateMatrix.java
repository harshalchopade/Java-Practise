package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void createMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no of rows: ");
		int rows = sc.nextInt();

		System.out.println("Please enter the no of cols: ");
		int cols = sc.nextInt();

		// 2D Array declaration
		int[][] data = new int[rows][cols];
		System.out.println("Please enter the matrix data: ");

		// Add element into the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i][j] = sc.nextInt();
			}
		}

//		// Print the element present in the array
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(data[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		// 2nd Approach
//		for (int[] r : data) {
//			for (int x : r) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}
//
//		// 3rd Approach
//		for (int[] r : data) {
//			System.out.println(Arrays.toString(r));
//		}
//
//		// 4th Approach
//		System.out.println(Arrays.deepToString(data));

		// 5th Approach
		Arrays.stream(data).forEach(e -> {
			Arrays.stream(e).forEach(j -> System.out.print(j + " "));
			System.out.println();
		});
	}

	public static void main(String[] args) {
		createMatrix();
	}
}
