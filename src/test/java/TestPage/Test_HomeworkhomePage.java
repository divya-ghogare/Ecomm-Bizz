package TestPage;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import Pages.Homework_Homepage;

public class Test_HomeworkhomePage extends Base_Class {
Homework_Homepage homework;

public Test_HomeworkhomePage() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		initialBrowser();
		homework=new Homework_Homepage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		CloseBowser();
	}
	
	@Test
	public void VerifyclickAddtoCart() throws InterruptedException {
		homework.SelectMen();
		
		homework.clickSummitKit();
		
		homework.clickAddtoCart();
		
	}

}
