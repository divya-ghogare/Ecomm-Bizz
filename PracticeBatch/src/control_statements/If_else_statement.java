package control_statements;

public class If_else_statement {
	
	public void verify() {
	
	int i= 200;
	if(i<=200) {
		System.out.println("number is valid");
	}else {
		System.out.println("number is invalid");
	}
	
	}
	public static void main(String[] args) {
		String city="mumbai";
		if(city=="pune") {
			System.out.println("city is pune");
		} else {
			System.out.println("city is mumbai");
		}
		
		
		If_else_statement ies=new If_else_statement();
		ies.verify();
	}

	}
