package ArrayOpertions;

import java.util.Scanner;

public class userInputDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int row = sc.nextInt();

		System.out.println("Enter number of columns");
		int column = sc.nextInt();

		int array1[][] = new int[row][column];
		int array2[][] = new int[row][column];

		int array3[][] = new int[row][column];

		System.out.println("Enter first array");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter second array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		// Division
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array3[i][j] = array1[i][j] / array2[i][j];
			}
			System.out.println();
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array3[i][j] + "  ");
			}
			System.out.println();

		}

	}

}
