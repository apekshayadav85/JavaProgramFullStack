package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class basicCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection is framework to stored manipulate group of object.
		//List,Queue & set : Interface
		//List classes:
			//Arraylist,Linkedlist,Vector & Stack
		//Queue:
			//Priority Queue & Interface Queue--->Array dqueue
		//Set:
			//Hashset & Linked set---->Interface:Sorted set
		
		//HashMap
		
		
		
		List<Integer> l= new ArrayList();
		
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(6);
		l.add(8);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> l1= new ArrayList();
		l1.add("Apeksha");
		l1.add("Akul");
		l1.add("Swara");
		l1.add("Swapnil");
		
		
		Iterator itr1 = l1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
	}

	}
}
