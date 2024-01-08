package this_keyword;

public class This_05 extends This_06 {
	int x=7;
	byte b=3;
	
	public void getdata() {
		System.out.println(this.x);
		System.out.println(this.d);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		This_05 t=new This_05();
		t.getdata();
		

	}

}
