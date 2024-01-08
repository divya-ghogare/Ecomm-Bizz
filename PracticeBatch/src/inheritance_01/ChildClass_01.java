package inheritance_01;

public class ChildClass_01 extends ParentClass_01{
	//IS-A-Relationship
	String s="xyz";

    public void city() {
    	System.out.println("im instance from child");
	  
  }
    public static void go() {
    	System.out.println("im static from child");
    }

	public static void main(String[] args) {
		ChildClass_01 c1=new ChildClass_01();
		c1.city_01();//parent
		c1.city();//child
		go_01();//parent
		go();//child
		System.out.println(c1.b);//parent
		System.out.println(c1.s);//child		
	}

}
