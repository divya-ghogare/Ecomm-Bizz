package abstractions;

public class Class_02 extends Class_01{


	public static void main(String[] args) {
		Class_02 c=new Class_02();
		c.colour();
		c.function();
		System.out.println(c.y);

	}

	@Override
	public void colour() {
		System.out.println("yellow");
	}
	
	

}
