package arrays;

public class Multi_Dimensional_Array2 {

	public static void main(String[] args) {
		//without memory allocation:
		
		int [][] abc= {{2,3,4},{2,3,4}};
		//nested loop:
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				//System.out.print(abc[i][j]);
				System.out.print("abc[" + i + "][" + j + "] = " + abc[i][j]+" ");
			}
			System.out.println();
		}

	}

}
