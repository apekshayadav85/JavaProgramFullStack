package Basics;

public class RightTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int k=5-i;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
