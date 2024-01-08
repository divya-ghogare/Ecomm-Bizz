package this_keyword;

public class This_03 {
	//user defined constructor;
	public This_03() {
		System.out.println("im user defined constructor");
		
	}
	//Parameterized constructor;
	public This_03(int i) {
		this();
		System.out.println("value of i is-"+i);
	
		
	}

	public static void main(String[] args) {
		This_03 t=new This_03(5);
	    
		
	}

}
