package DataTypes;

public class DataTypes {
	
	//numeric data types
	
	byte b= 56;
	short s= 78;
	int i= 895;
	long l= 2786;
	
	//float data types
	
	float f=45.58f;
	double d= 38.495;
	
	//non numeric data type
	
	boolean n= true;
	char c='s';
	
	//non primitive data type
	String ab=" we are in practice batch";

  
    public static void main(String[] args) {
    	DataTypes dt= new DataTypes();
    	System.out.println(dt.b);
    	System.out.println(dt.s);
    	System.out.println(dt.i);
    	System.out.println(dt.l);
    	System.out.println(dt.f);
    	System.out.println(dt.n);
    	System.out.println(dt.c);
    	System.out.println(dt.ab);
    	//to print both string and variable
    	System.out.println("this is byte variable "  + dt.b);	
	}	

    }
