package arrays;

import java.util.Scanner;

public class Int_Array {
         // to take value from user:
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size");
		int size=sc.nextInt();
		
		int[]city=new int[size];
		System.out.println("enter your array value");
		//for input value:
		for(int x=0; x<size; x++) {
			city[x]=sc.nextInt();
		}
		
		for (int i=0;i<city.length;i++) {
			System.out.println(city[i]);
		}
		
      
	}

}
