package constructor;

public class Constructor_Ex {
	
	public Constructor_Ex() {//constructor name must be same as class name 
	}
	//method return statement-
	public static void name_01(String name) {
		System.out.println("your name is "+name);
		return;
		}
	public static int verifysum(int a ,int b) {
		 int sum=a + b;
		 System.out.println(sum);
		 return sum;
		
	}
	public static int verifyproduct(int x, int y) {
		int product=x*y;
		System.out.println(product);
		return y;
	}
    public static void main(String[] args) {
    	name_01("peter");
    	verifysum(10, 10);
    	verifyproduct(5, 5);
    }
}
