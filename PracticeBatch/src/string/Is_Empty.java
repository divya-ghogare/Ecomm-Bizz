package string;

public class Is_Empty {
      
	    String v="wardha";
	public static void main(String[] args) {
		String s="ab";
		String a="";
		System.out.println(s.isEmpty());
        System.out.println(a.isEmpty());
	
        
	    //to check length of char:
	    String s1="wadner";
	    System.out.println(s1.length());
	    
	    
	  //to replace char:
	    System.out.println(s1.replace("w", "b"));
	    //or:
	    Is_Empty i=new Is_Empty() ;
	    	System.out.println(i.v.replace("w", "s"));
	    
	    	
	    //to get index w.r.t.char:
	    	String c="city";
	    	System.out.println(c.indexOf("t"));
	    	System.out.println(c.indexOf("y"));
	    	
	    	
	    	//to get substring w.r.t.index:
	    	String b="washinton";
	    	System.out.println(b.substring(2));
	    	System.out.println(b.substring(2, 6));
	    	
	    	
	    	//to get char w.r.t.index:
	    	String d="automation";
	    	System.out.println(d.charAt(4));
	    	System.out.println(d.charAt(2));
	    	
	    	
	    	//add another string in given string:
	    	String e="wadner";
	    	String f=" bhujang";
	    	System.out.println(e.concat(f));
	    	
	    	//or:
	    	System.out.println(e.concat(" is a village"));
	    	System.out.println(e + f);
	    	System.out.println(e + " bhujang");
	    	
	    	
	    	//to get sting char in lower case:
	    	String g="Divya";
	    	System.out.println(g.toLowerCase());
	    	
	    	
	    	//to get sting char in upper case:
	    	String h="divya";
	    	System.out.println(h.toUpperCase());
	    	
	    	
	}
}
	
