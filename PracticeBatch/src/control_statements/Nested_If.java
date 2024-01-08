package control_statements;

public class Nested_If {

	public static void main(String[] args) {
		long l = 20000;
		if (l==20000) {
			
			if (l>10000) {
				System.out.println("no. is greater than 10000");
				
				if (l<30000) {
					System.out.println("no.is less than 30000");
				}
					} else {
				System.out.println("no. is different");
			}
		

	}
	}
}
