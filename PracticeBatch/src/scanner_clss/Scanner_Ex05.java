package scanner_clss;

import java.util.Scanner;

public class Scanner_Ex05 {

	public static void main(String[] args) {
		//to print month between 1 to 12
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number between 1 to 12: ");
		month=sc.nextInt();
		
		switch(month) {
		case 1:
		System.out.println("months is jan");
		break;
		case 2:
			System.out.println("month is feb");
			break;
		case 3:
			System.out.println("month is march");
			break;
		case 4:
			System.out.println("month is april");
		break;
		case 5:
			System.out.println("month is may");
			break;
		case 6:
			System.out.println("month is june");
			break;
		case 7:
			System.out.println("month is july");
			break;
		case 8:
			System.out.println("month is aug");
		case 9:
			System.out.println("month is sept");
			break;
		case 10:
			System.out.println("month is oct");
			break;
		case 11:
			System.out.println("month is nov");
			break;
		case 12:
			System.out.println("month is dec");
			break;
			default:
			System.out.println("month is invalid");
			break;
			
			
		
		}
		
		
	}

}
