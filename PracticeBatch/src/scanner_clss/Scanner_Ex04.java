package scanner_clss;

import java.util.Scanner;

public class Scanner_Ex04 {

	public static void main(String[] args) {
		String s="xyz";
		Scanner sc=new Scanner(s);  //to verify scanner class contain string
		System.out.println("string is present: "+ sc.hasNext());
		System.out.println("given string is: "+sc.nextLine());
		
		}

}
