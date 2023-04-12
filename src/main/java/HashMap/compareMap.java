package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class compareMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm= new HashMap<Integer,String>; 
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "A");
		map2.put(2, "B");
		map2.put(1, "C");
		map2.put(4, "C");
		map2.put(5, "C");
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		combineKeys.addAll(map2.keySet);
		System.out.println(combineKeys);
		System.out.println(new ArrayList<>(map1.values()).equals(map2.values()));
		
		Iterator<Entry<String, String>> it1 = hm.entrySet().iterator();
		while (it1.hasNext()) {
					Entry<String, String> entry = it1.next();
					System.out.println("Key :::: " + entry.getKey() + " Value :::: " + entry.getValue());
				}
	}

}
