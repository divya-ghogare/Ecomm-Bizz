package Patterns;

public class Inverted_halfpyramid_rotateby180 {

	public static void main(String[] args) {
		/*                   *
		 *               *   *   
		 *           *   *   *
		 *       *   *   *   *
		 */
		int row =4;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		 
	}

}
