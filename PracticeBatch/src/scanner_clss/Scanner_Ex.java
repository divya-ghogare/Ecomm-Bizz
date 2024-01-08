package scanner_clss;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter 1st number");
		int input_01=sc.nextInt();	
		System.out.println("enter 2nd number");
		int input_02=sc.nextInt();
		
		int total_input =input_01 * input_02;
		System.out.println("multiplication of given no is " +total_input);
	}

}
