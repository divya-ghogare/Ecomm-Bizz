package this_keyword;

public class This_04 {
	int x;
	float f;
	String s;
	
	public This_04() {
		System.out.println("im user defined constructor");
		
	}
    public This_04(int x) {
    	this.x=x;
    	
    }
    public This_04(int x, float f) {
    	this.x=x;
    	this.f=f;
    	
    }
    public This_04(int x, float f, String s) {
    	this.x=x;
    	this.f=f;
    	this.s=s;
    	
    }
	public static void main(String[] args) {
		This_04 t=new This_04();
		System.out.println(t.x);
		System.out.println(t.f);
		System.out.println(t.s);
		System.out.println(".....................");
		
		This_04 t1=new This_04(5);
		System.out.println(t1.x);
		System.out.println(t1.f);
		System.out.println(t1.s);
		System.out.println("......................");
		
		This_04 t2=new This_04(5,59.56f);
		System.out.println(t2.x);
		System.out.println(t2.f);
		System.out.println(t2.s);
		System.out.println("......................");
		
		This_04 t3=new This_04(5, 59.56f,"abc");
		System.out.println(t3.x);
		System.out.println(t3.f);
		System.out.println(t3.s);
		System.out.println("......................");
	}

}
