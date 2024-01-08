package arrays;

public class Multi_D_Array3 {

	public static void main(String[] args) {
		//3*3 matrix:
		//without memory allocation:
		
		int[][] ab= {{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				//System.out.print(ab [x][y]);
				System.out.print("ab [" + x + "][" + y + "] = " + ab[x][y] + " ");
			}
			System.out.println();
		}
		

	}

}
