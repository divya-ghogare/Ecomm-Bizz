package super_keyword;

public class Super_01 extends Parent_01{
	
	public Super_01(int x) {
		super(x);
		System.out.println("im user defined constructor");	
	}

	double d=20.40;
	
	public void display() {
		System.out.println(super.d);
	}

	public static void main(String[] args) {
		Super_01 s=new Super_01(4);
		 System.out.println(s.d);
		
	
	}

}
