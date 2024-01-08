package multilevel_constrctor;

public class Child_Class02 extends Child_Class01{
	public void city() {
		System.out.println("instance method from sub class2");
		
	}

	public static void functionality() {
		System.out.println("static method from sub class2");
	}

	public static void main(String[] args) {
		Child_Class02 c1=new Child_Class02();
		c1.getdata();      //parent
		c1.get();          //parent
		c1.go();           //child01
		c1.verify();        //child01
		c1.city();          //child02
		c1.functionality();  //child02
		

	}

}
