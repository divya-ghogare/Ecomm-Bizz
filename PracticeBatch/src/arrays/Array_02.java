package arrays;

public class Array_02 {

	public static void main(String[] args) {
		int age[]=new int[3];
		age[0]=55;
		age[1]=45;
		age[2]=35;
		
		System.out.println(age[2]);
		
		//to determine lenght of array:
		System.out.println(age.length);
		
		for(int x=0; x<=age.length; x++) {
			System.out.println(x);
		}
		System.out.println("...........................");
	

	
        
	for(int y:age) {
		System.out.println(y);
	}
	
	}
}
