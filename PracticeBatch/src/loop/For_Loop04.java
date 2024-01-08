package loop;

import java.util.Scanner;

public class For_Loop04 {

	public static void main(String[] args) {
		//to print table of no. input and input given by user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numebr: ");
		int n=sc.nextInt();
		System.out.println("table of "+n+ " is:");
		for(int i=1; i<=10; i++) {
			System.out.println(i*n);
		}
	}

}
