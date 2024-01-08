package method_overloading;

public class Class_03 {
	
	public int add(int a, int b) {
		System.out.println("addn of two int data type"); 
		int z=a+b;
		System.out.println(z);
		return z;
	}
	
	public double add(double a, double b) {
		System.out.println("addn of two double data type");
		double z=a+b;
		System.out.println(z);
		return z;
		
	}

	public static void main(String[] args) {
		Class_03 c=new Class_03();
		c.add(30.2, 30.4);
		c.add(32, 32);
		
	}

}
