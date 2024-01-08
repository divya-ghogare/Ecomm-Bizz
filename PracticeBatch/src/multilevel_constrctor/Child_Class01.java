package multilevel_constrctor;

public class Child_Class01 extends Parent_Class {
	public void go() {
		System.out.println("instance method from sub class1");
		
	}

	public static void verify() {
		System.out.println("static method from sub class1");
	}

	public static void main(String[] args) {
		Child_Class01 c=new Child_Class01();
		c.getdata();   //parent
		c.get();       //parent
		c.go();       //child
		c.verify();   //child
		

	}

}
