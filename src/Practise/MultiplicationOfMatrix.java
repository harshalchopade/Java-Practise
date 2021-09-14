package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void multiplicationOfMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no of rows for Matrix1: ");
		int rowsInFirst = sc.nextInt();

		System.out.println("Please enter the no of cols in Matrix1 or no of rows in Matrix2 : ");
		int colsInFirstAndRowsInSecond = sc.nextInt();

		System.out.println("Please enter the no of cols in Matrix2 : ");
		int colsInSecond = sc.nextInt();

		// 2D Array declaration
		int[][] matrix1 = new int[rowsInFirst][colsInFirstAndRowsInSecond];
		int[][] matrix2 = new int[colsInFirstAndRowsInSecond][colsInSecond];
		int[][] result = new int[rowsInFirst][colsInSecond];

		// Add element into the matrix1
		System.out.println("Please enter the matrix1 data: ");
		for (int i = 0; i < rowsInFirst; i++) {
			for (int j = 0; j < colsInFirstAndRowsInSecond; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Add element into the matrix2
		System.out.println("Please enter the matrix2 data: ");
		for (int i = 0; i < colsInFirstAndRowsInSecond; i++) {
			for (int j = 0; j < colsInSecond; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rowsInFirst; i++) {
			for (int j = 0; j < colsInSecond; j++) {
				for (int k = 0; k < colsInFirstAndRowsInSecond; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];

				}
			}
		}
		
		//Print final data
		System.out.println("Print Product final data:");
		for(int[] r : result)
		{
			System.out.println(Arrays.toString(r));
		}
	}

	public static void main(String[] args) {
		multiplicationOfMatrix();

	}
}
