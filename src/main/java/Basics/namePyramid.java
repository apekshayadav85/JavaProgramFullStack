package Basics;

public class namePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str= "apeksha";
		char[] str = {'a','p','e','k','s','h','a'};
		
		int i = str.length - 1;
		
		for(;i>=0;)
		{
			for(int j=i;j>=0;j--)
			{
				
				System.out.print(str[i]);
			}
		System.out.println();
		i--;
		}
	}

}
