package Practise;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows : ");
		int rows = sc.nextInt();

		System.out.println("Enter no of cols : ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		int[][] transpose_matrix = new int[cols][rows];

		System.out.println("Enter the data to create matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("Print the data of the matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] +" "); 
			}
			System.out.println();
		}
		
		System.out.println("Transpose of the matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[j][i] + " "); 
			}
			System.out.println();
		}
	}

}
