package MethodTypes;

public class Methods_TypesandVariables_Types {
	//instance variable
	int i= 2000;
	
	//instance method
	public void a() {
		System.out.println("this is instance method");
		
	}
	//static variable
	static double d= 475.4859;
	
	//static method
	public static void b() {
		short s=3846;
		Methods_TypesandVariables_Types mt=new Methods_TypesandVariables_Types();
		//System.out.println(mt.i);
		//System.out.println("this is static method.d");
		System.out.println("local variable is " +s);

	}

	public static void main(String[] args) {
		Methods_TypesandVariables_Types mt_1=new Methods_TypesandVariables_Types();
		System.out.println(mt_1.i);
	    System.out.println(d);
	    System.out.println("Methods_TypesandVariables_Types");
	    b();                      //directly static method call
	    //Methods_TypesandVariables_Types.b(); //class name
	    

		

	}

}
