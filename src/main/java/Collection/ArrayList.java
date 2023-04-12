package Collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrays a = new Arrays();

		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Tom");
		l1.add("Peter");
		l1.add("Jhon");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Tom");
		l2.add("Peter");
		l2.add("Jhon");
		l2.add("Jack");

		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("Tom");
		l3.add("Peter");
		l3.add("Jhon");
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println("Checking that l1 and l2 are equals using sorting and equals :::: " + l1.equals(l2));
		System.out.println("Checking that l1 and l3 are equals using sorting and equals:::: " + l1.equals(l3));
	}

}
