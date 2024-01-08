package Exeptions;

public class Customized_Exception {
	
	public void exception() {
		System.out.println(10/0);
		throw new ArithmeticException("cant devide by zero");
	}

	public static void main(String[] args) {
		Customized_Exception c=new Customized_Exception();
        c.exception();
        System.out.println("hiii");
	}

}
