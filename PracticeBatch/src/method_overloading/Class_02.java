package method_overloading;

public class Class_02 {

	public void care(float y) {
		System.out.println("this is method with float data type");
		System.out.println(y);
	}

	public void care(int x) {
		System.out.println("this is method with int data type");
		System.out.println(x);
	}

	public void care(double d) {
		System.out.println("this is method with double data type");
		System.out.println(d);
	}

	public void care(String s) {
		System.out.println("this is method with String data type");
		System.out.println(s);
	}

	public static void main(String[] args) {
		Class_02 c=new Class_02();
		c.care(20);
		c.care(20.30f);
		c.care(40.30);
		c.care("abc");

	}

}
