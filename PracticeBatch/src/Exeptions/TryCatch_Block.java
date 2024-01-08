package Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch_Block {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("");
		} catch (FileNotFoundException e) {
		System.out.println("trycatch block-1");
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("trycatch block-2");
			System.out.println(e.getMessage());
		}catch (NullPointerException ne) {
			
		}catch (ArithmeticException ae) {
			
		}catch(Exception b) {
			
		}
		
	}

}
