package method_overloading;

public class class_01 {
	
	public void a(int i) {
		System.out.println("this method with int data type");
	}
	
	public void a(float f) {
		System.out.println("this method with float data type");
	}
	
	public void a(String s) {
		System.out.println("this method with String data type");
	}
	
	//we can overload static method:
	public static void b(int k) {
		System.out.println("this static method is with int data type");
	}
	
	public static void b(int m, boolean b) {
		System.out.println("this static method is with int data type and boolean data type");
	}

	public static void main(String[] args) {
		class_01 c=new class_01();
		c.a(20.30f);
		c.a(4);
		c.a("abc");
        b(30);
        b(20, true);
	}

}
