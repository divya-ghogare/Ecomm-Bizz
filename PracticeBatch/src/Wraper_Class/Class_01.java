package Wraper_Class;

public class Class_01 {

	public static void main(String[] args) {
		//covert primitive datatype into wrapper class:
		int t=400;
		Integer i= Integer.valueOf(t);
		System.out.println(i);
		
		float f=48.59f;
		Float t1=Float.valueOf(f);
        System.out.println(t1);
        
        
        //convert wrapper class to primitive datatype:
        Integer k=new Integer(8000);
        int j=k.intValue();
        System.out.println(j);
	}

}
