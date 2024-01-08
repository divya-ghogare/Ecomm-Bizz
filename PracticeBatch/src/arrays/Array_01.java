package arrays;

public class Array_01 {

	public static void main(String[] args) {
		//by allocating memory:
		int[]marks=new int[5];
		//or
		//int markss[]=new int[5];
		
		//to assign value:
		marks[0]=80;
		marks[1]=70;
		marks[2]=60;
		marks[3]=50;
		marks[4]=40;
		
		//to print any number:
		//System.out.println(marks[3]);
		
		//to print all number:
		for(int i=0; i<5;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("..........");
		
		//another way:
		for(int x:marks) {
			System.out.println(x);
		}
		System.out.println(".....................");
		
		//without memory allocation:
		int[] a= {2,3,4,5,6,7,8,9};
		System.out.println(a[0]);
		System.out.println(".........................");
		System.out.println("length of array is:-"+a.length);
		System.out.println(a.length);
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}

	}
	
}
