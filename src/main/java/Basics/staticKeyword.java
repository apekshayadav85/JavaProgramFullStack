package Basics;

public class staticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.staticnestclass obj = new outer.staticnestclass();
		obj.nestMethod();
	}

}

class outer
{
	static String str ="ABC";
	static class staticnestclass
	{
		void nestMethod(){
			System.out.println("static: "+str);
		}
	}
}


