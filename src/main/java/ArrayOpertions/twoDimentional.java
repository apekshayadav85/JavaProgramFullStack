package ArrayOpertions;

public class twoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr1[][]=new int[2][2];
		// int arr2[][]= {{1,2,3},{4,5,6}};
		// String str1[][]= {{"ganesh","mahesh"},{"ramesh","Saurabh"}};
		// String str2[][] =new String[2][2];

		int arr1[][] = new int[7][89];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		System.out.println("row " + arr1.length);
		System.out.println("col " + arr1[1].length);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[1].length; j++) {
				// System.out.print(arr1[i][j] + " ");
			}
		}

	}
}
