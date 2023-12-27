package TestPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import Pages.HomePage;
import Pages.LoginPage;

public class Test_LoginPage extends Base_Class{
	HomePage homepage;
	LoginPage loginPage;

	public Test_LoginPage() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		initialBrowser();
		homepage=new HomePage();
		loginPage=new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		CloseBowser();
		
	}
	
	@Test
	public void TestLogin() throws IOException {
		homepage.verifySignin();
		loginPage.verifyLogin();
		
	}
	
	@Test
	public void TestcustomerLogintext() throws IOException {
		homepage.verifySignin();
		Assert.assertEquals(loginPage.verifyLoginText(), "customer Login");
		
	}
	
	@Test
	public void TestCreateaccontBtn() throws IOException {
		homepage.verifySignin();
		loginPage.verifybtnCreateAccount();
	}
	
	
	
	

}
