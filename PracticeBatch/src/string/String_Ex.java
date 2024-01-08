package string;

public class String_Ex {

	public static void main(String[] args) {
        String a="we are in practice batch";
        if (a.contains("are")) {
       	//System.out.println("are is present in above string ");
        }
        	
       // System.out.println("condition is false");
        
        //equals;
       
        String b="laptop";
        if(b.equals("laptop")) {
        	//System.out.println("string is equal");
        	
        	String c="python";
        	if(c.equalsIgnoreCase("PYthon")) {
        		//System.out.println("both ar equal");
        		
        		String d="laptop";
        		if(d.endsWith("op")) {
        			//System.out.println("ends with op");
        			
        			
        			String e="laptop";
            		if(!(e.endsWith("op"))) {
            			System.out.println(" not ends with op");
            		}
            		System.out.println("condition is false");
        		}
        	
        		
        	}
        }
	}
      
      
       
}
