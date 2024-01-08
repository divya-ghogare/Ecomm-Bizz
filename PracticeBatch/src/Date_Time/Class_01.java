package Date_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_01 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		
		//or:
		Date t=new Date();
		String ab = t.toString();
		System.out.println(ab);
		
		
		//for DD/MM/YYYY format:
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(df.format(d));
		

	}

}
