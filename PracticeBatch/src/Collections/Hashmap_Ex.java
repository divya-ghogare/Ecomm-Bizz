package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap_Ex {

	public static void main(String[] args) {
		TreeMap<Integer, String> tp=new TreeMap<Integer, String>();
		
		//to add values:
		tp.put(0, "ab");
		tp.put(1, "cd");
		tp.put(2, "ef");
		tp.put(4, "gh");
		tp.put(5, "ij");
		tp.put(1, "kl");
		//System.out.println(tp);
		
		//to remove value:
		tp.remove(2);
		System.out.println(tp);
		
		//to replace value:
		tp.replace(4, "xy");
		System.out.println(tp);
		
		//to get size:
		System.out.println(tp.size());
		
		//tp.clear();
		//System.out.println(tp);
		
		tp.clone();
		System.out.println(tp);
		
		System.out.println(tp.values());
		
		//to add values:
		tp.computeIfAbsent(8, k ->"jk");
		System.out.println(tp);
		
		//iterator interface:
		//1, convert map into set- use entryset():
		//2. use iterator();
		
		Set<Entry<Integer, String>> s = tp.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			System.out.println("key is:-" +m.getKey());
			System.out.println("vlue is:-" +m.getValue());
		}
			
	}

}
