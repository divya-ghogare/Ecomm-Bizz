package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Ex {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		/*
		to add values from 10-20:
		for(int i=10; i<=20; i++) {
			hs.add(i);
		}
		to print all values:
		System.out.println(hs);
		*/
		
		//or:
		hs.add(23);
		hs.add(33);
		hs.add(25);
		hs.add(null);
		hs.add(23);
		hs.add(null);
		hs.add(24);
		hs.add(57);
		hs.add(56);
		/*
		hs.remove(24);
		System.out.println(hs.contains(23));
		System.out.println(hs.clone());
		hs.clear();
		System.out.println(hs.isEmpty());
		System.out.println(hs);
*/
	Iterator<Integer> i=hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
