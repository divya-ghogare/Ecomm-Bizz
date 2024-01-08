package scanner_clss;

import java.util.Scanner;

public class Scanner_Ex03 {

	public static void main(String[] args) {
		//two input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.println("addtion of two number is:"+(a+b));
		//System.out.println("multiplication of two number is:"+(a*b));
		//System.out.println("division of two number is:"+(a/b));
		System.out.println("modulus of two number is:"+(a%b));
		
	}

}
