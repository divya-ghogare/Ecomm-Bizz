package Exeptions;

public class Class_01 {
	
	public void get () {
		//System.out.println("get method");
		
		//unchecked ex:
		int []a=new int[2];
		a[0]=3;
		a[1]=5;
		a[2]=7;
	    System.out.println(a[2]);
				}
	
	//unchecked ex:
		
	public void print() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void main(String[] args) {
		Class_01 c=new Class_01();
		c.get();
		c.get();
		//System.out.println(10/0);
	}

}
