package AccessModifiers;

public class AccessSpecifiers {

	int classvar = 54;
	protected int pro = 980;
	public int pub = 876;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int local = 34;
		System.out.println(local);
	}

	public void method1() {
		System.out.println(classvar);
	}

}

class second extends AccessSpecifiers {
	public void second1() {
		System.out.println(classvar);
	}

}
