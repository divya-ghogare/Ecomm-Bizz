package method_overriding;
class parent_class {
	
	public void workhard() {
		System.out.println("super class workhard");
	}
}

public class Class_01 extends parent_class{
	
	public void workhard() {
		System.out.println("subclass workhard");
	}

	public static void main(String[] args) {
		Class_01 c=new Class_01();
		c.workhard();      //only run child class object if object is same

	}

}
