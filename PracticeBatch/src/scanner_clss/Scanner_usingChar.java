package scanner_clss;

import java.util.Scanner;

public class Scanner_usingChar {

	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter single character");
		c=sc.next().charAt(0);
		System.out.println("your single char is: "+c);
		
		

	}

}
