package String;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rev = "apeksha";
		String strarray1[] = new String[rev.length()];
		strarray1 = rev.split("");
		System.out.println(strarray1.length);
		// System.out.println(strarray1[20]);
		for (int i = strarray1.length - 1; i >= 0; i--) {
			System.out.print(strarray1[i] + " ");
		}

	}

}
