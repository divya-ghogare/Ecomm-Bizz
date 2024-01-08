package arrays;

public class Multi_dimensional {

	public static void main(String[] args) {
		//memory allocation:
		int[][]table=new int[2][3];
		
		//matrix 2*3:
		table[0][0]=4;
		table[0][1]=5;
		table[0][2]=6;
		table[1][0]=7;
		table[1][1]=8;
		table[1][2]=9;
		
		//System.out.println(table[1][0]);
		
		//nested loop:
		//for row increment:
		for(int i=0;i<2;i++) {
			//for column increment:
			for(int x=0; x<3;x++) {
				System.out.print(table[i][x]+" ");
			}
			
			System.out.println();
		}
		
		//without memory allocation:
		int[][]table1= {{4,5,6},{7,8,9}};
		System.out.println(".................");
		System.out.println(table1[0][2]);
		
		//for nested loop:
		for(int x=0; x<2; x++) {
			for(int y=0; y<3; y++) {
				//System.out.println(table1 [x][y]);
				System.out.print("table1[" + x + "][" + y + "] = " + table1[x][y]);
			}
				System.out.println();
		}

	}

}
