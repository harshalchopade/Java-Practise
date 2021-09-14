package Practise;

import java.util.Scanner;

public class AdditionAndSubtractionOfMatrix {

	public static void additionOfMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no of rows: ");
		int rows = sc.nextInt();

		System.out.println("Please enter the no of cols: ");
		int cols = sc.nextInt();

		// 2D Array declaration
		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] result = new int[rows][cols];

		// Add element into the matrix1
		System.out.println("Please enter the matrix1 data: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Add element into the matrix2
		System.out.println("Please enter the matrix2 data: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j]; // for subtaction replace + with -
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		additionOfMatrix();
	}
}
