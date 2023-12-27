package TestPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import Pages.HomePage;

public class Test_HomePage extends Base_Class {
HomePage homepage;
	public Test_HomePage() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		initialBrowser();
		homepage=new HomePage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		CloseBowser();
	}
	
	@Test
	public void testPageTitle() {
		
		Assert.assertEquals(homepage.verifypageTitle(), "Magento 2 Commerce (Enterprise) B2B Demo - Magebit");
	}
	
	@Test
	public void TestPageLogo() {
		Assert.assertTrue(homepage.verifyLogo());
	}
	
	@Test
	public void TestSignIn() throws IOException {
		homepage.verifySignin();
	}
	
	@Test
	public void TestCreateAccount() throws InterruptedException, IOException {
		homepage.verifyCreateAccount();
	}

}
