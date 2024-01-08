package this_keyword;

public class This_02 {
	
	public void display() {
		int s=30;
		System.out.println(s);
	}
	public void getdata() {
		this.display();
		System.out.println("im girl");
	}

	public static void main(String[] args) {
		This_02 t=new This_02();
		t.getdata();
	}

}
