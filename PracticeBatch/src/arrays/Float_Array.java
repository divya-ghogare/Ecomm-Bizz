package arrays;

import java.util.Scanner;

public class Float_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array value");
		
		int size=sc.nextInt();
		float age[]=new float [size];
		
		//for input value:
		for(int i=0;i<size; i++) {
			age[i]=sc.nextFloat();
		}
		System.out.println("........................");
		
		//for output:
		for(int x=0; x<size; x++) {
			System.out.println(age[x]);
					}
		

	}

}
