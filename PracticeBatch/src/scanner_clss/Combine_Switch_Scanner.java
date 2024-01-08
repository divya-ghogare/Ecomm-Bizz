package scanner_clss;

import java.util.Scanner;

public class Combine_Switch_Scanner {

	private static int result;

	public static void main(String[] args) {
		//take two input from user
		String ab;
		int num1, num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("choose an operator from given: +,-,*,/,%, or");
		ab=sc.nextLine();
		
		System.out.println("enter 1st number ");
		num1=sc.nextInt();
		
		System.out.println("enter 2nd number");
		num2=sc.nextInt();
		
		switch(ab) {
		case "+":
		result =num1+num2;
		System.out.println(num1+" + "+num2+" = "+result);
		break;
		
		case "*":
			result=num1*num2;
			System.out.println(num1+" * "+num2+" = "+result);
			break;
			
		case "/":
			result=num1/num2;
			System.out.println(num1+" / "+num2+" = "+result);
			break;
			
		case "-":
			result=num1-num2;
			System.out.println(num1+" - "+num2+" = "+result);
			break;
			
			default:
				System.out.println("invalid operator");
		    break;
			
		
			
		}
		
		
		

	}

}
