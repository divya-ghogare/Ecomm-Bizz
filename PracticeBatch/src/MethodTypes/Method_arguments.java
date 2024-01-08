package MethodTypes;

public class Method_arguments {
	int i;
	int b;
	
	//i want value of instance variable
	
	public void sub(int x) {
		i=x;
	}
	
	public void add (int y) {
		b=y;
	}
		public void display_value() {
			System.out.println("value of x is "+i);
			System.out.println("value of y is "+b);

		}
	

	public static void main(String[] args) {
		 Method_arguments mg=new Method_arguments();
		 mg.add(4859);
		 mg.sub(3648);
	     mg.display_value();
		
	}

}
