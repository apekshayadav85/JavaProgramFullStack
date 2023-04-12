package HashMap;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm= new HashMap<Integer,String>; //Key pair value
		hm.put(1,"abc");
		hm.put(2,"pqr");
		hm.put(3,"xyz");
		hm.put(1,"vah");
		hm.put(5,"aaa");
		hm.put(null,"abc");
		
		System.out.println("HashMap key pair value:" +hm.get(3));
		// if key duplicate then only print latest one
		System.out.println("HashMap key pair value:" +hm.get(null));
		hm.remove(2);
		System.out.println(hm);
		
		Iterator<Integer> it= hm.keySet().iterator();
		while(it.hasNext())
		{
			Integer key= it.next();
			Integer value = hm.get(key);
			System.out.println("key  = " + key  + "Value = " + value);
		}
	}

}
