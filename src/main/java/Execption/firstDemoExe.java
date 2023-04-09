package Execption;

public class firstDemoExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=1;
			int b=0;
			int c;
			int array[]= new int[4];
			array[5]=12;
			//int array2[]= {1,1,2,3,4};
			//c=a/b;
			String str="Apeksha";
			String str2=null;
			System.out.println(str2.length());
			//int i =Integer.parseInt(str);
			//System.out.println(c);
		}
		
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("ArithmeticException");
		}
		catch(NumberFormatException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("NumberFormatException");
		}
		catch(NullPointerException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("Array Index out of bounds exception");
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			System.out.println("Default Execption");
		}
		//finally
		//{
			//System.out.println("Hello finally");
		//}
	}

}
