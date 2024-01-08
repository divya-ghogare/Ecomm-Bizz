package Collections;

import java.util.ArrayList;

public class Arraylist_Ex {

	public static void main(String[] args) {
		ArrayList<String> ab=new ArrayList<String>();
		
		//to add data in list:
			ab.add("divya");
			ab.add("jaya");
			ab.add("siya");
			ab.add(3,"radhika");
			ab.add("divya");             //can accept duplicate value
			ab.add("nayra");
			ab.add("kamini");
			ab.add("mehek");
			System.out.println(ab);
			String a = ab.get(1);
			System.out.println("the value of 1st index is:-"+a);
			//ab.remove(4);
			System.out.println(ab);
			
			ab.remove("divya");
			System.out.println(ab);
			
			System.out.println(ab.contains("divya"));    //to search any value
			
			System.out.println(ab.indexOf("kamini"));   //to print value
			
			//to add another value:
			ab.add("sita");
			System.out.println(ab);
			
			//to remove all values:
			//ab.clear();
			System.out.println(ab);
			
			// for lenght value/or size:
			System.out.println("the size of ab is:-"+ab.size());
			System.out.println(ab.isEmpty());
			
			////to get copy of list:
			System.out.println(ab);
			System.out.println(ab.clone());
	}

}
