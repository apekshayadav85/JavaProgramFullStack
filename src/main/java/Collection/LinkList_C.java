package Collection;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Collection");
		LinkedList<String> al=new LinkedList<String>();
		al.add("Ganesh");
		al.add("Rupali");
		al.add("Pornima");
		al.add("Apeksha");
		
		Iterator atl = al.iterator();
		
		while(atl.hasNext())
		{
			System.out.println(atl.next());
		}
		
		
	}

}
