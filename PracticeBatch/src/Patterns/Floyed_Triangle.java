package Patterns;

public class Floyed_Triangle {

	public static void main(String[] args) {
		/* 1
		 * 2  3 
		 * 4  5  6 
		 * 7  8  9 10
		 * 11 12 13 14 15
		 */
          int row=5;
          int num=1;
          for(int x=1; x<=5; x++){
          for(int j=1; j<=x; j++) {
        	  System.out.print(num +" ");
        	  num++;
        	  
          }
          System.out.println();
          }
	}

}
