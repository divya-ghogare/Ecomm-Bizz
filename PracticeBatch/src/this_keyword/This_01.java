package this_keyword;

public class This_01 {
	
	int i;
	String s;
	
	public This_01(int i,String s) {
		this.i=i;
		this.s=s;
		System.out.println(this.i);
		System.out.println(this.s);
		
	}

	public static void main(String[] args) {
		This_01 t=new This_01(3,"abc");
		

	}

}
