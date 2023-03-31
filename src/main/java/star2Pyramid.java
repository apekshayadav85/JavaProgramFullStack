
public class star2Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<5;i++)
		{
			//System.out.println("before j loop, i=" +i);
			for(int k=i;k<5;k++)
			{
			  System.out.print(" ");
			}			
			for(int j=0;j<5;j++)
			{
			   System.out.print(" *");
			}
			//System.out.println("after j loop, i=" +i);
			System.out.println();
		}
		System.out.println();
	}

}
