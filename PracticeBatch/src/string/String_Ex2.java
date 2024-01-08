package string;

public class String_Ex2 {

	public static void main(String[] args) {
	
		String s=new String(" table");
		System.out.println(s.trim());
		System.out.println(s);
		
		String a=new String("automaion     testing "); //dnt remove middle space only rmv start and end space
			System.out.print(a.trim());
		    System.out.print("hiiii");
		    System.out.println("........................");
		    
		    //containg:
		    String c=new String("automation");
		    if(s.contains("t")) {
		    System.out.println("char is present in string");
		    }
		    
		    //or:
		    String d="ball is on table";
		    System.out.println(d.contains("b"));
		    System.out.println(d.contains("is on"));
		    
		    
		    //equal:
		    String s1="Divya";
		    String s2="Divya";
		    System.out.println(s1.equals("divya"));
		    System.out.println(s1.equalsIgnoreCase("divya"));
		    System.out.println(s1.equals(s2));
		    
		    
		    //to break string:
		    String xy = "how are you now";
		   String[] mn = xy.split(" ");
		   /* System.out.println(mn[0]);
		    System.out.println(mn[1]);
		    System.out.println(mn[2]);
		    System.out.println(mn[3]);*/
		 	   //or:
		    for(String op:mn) {
		    	System.out.println(op);
		    	//or:
		    	String j="auomation";
		    	String[] ab = j.split("t");
		    	System.out.println(ab[0]);
		    	System.out.println(ab[1]);
		    	System.out.println("......................");
		    	
		    	//to pring char in forward direction:
		    	String k="auomation testing batch";
		    	for(int i=0; i<k.length(); i++) {
		    		//System.out.println(k.charAt(i));
		    		
		    		//in one line print:
		    		System.out.print(k.charAt(i) + " ");
		    	System.out.println(".......................");
		    	}	
		    	
		    	
		    	
		    	//print in reverse direction:
		    	for(int l=k.length()-1; l>=0; l-- ) {
		    		//System.out.println(k.charAt(l));
		    		System.out.print(k.charAt(l)+" ");
		    	}
		    	}
		    }
	}


