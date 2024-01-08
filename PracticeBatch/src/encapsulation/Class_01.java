package encapsulation;

public class Class_01 {
	
	private int e=10000;
	
	public void hidemoney(int v) {
		e=v;
		
		System.out.println(e);
	}

	public static void main(String[] args) {
		Class_01 c=new Class_01();
		c.hidemoney(000);

	}

}
