package TestPage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Base_Class;
import Pages.CreateAccountpage;
import Pages.HomePage;
import Pages.LoginPage;
import Utility.Excel_Handling;

public class Test_CreateaccountPage extends Base_Class {

	public Test_CreateaccountPage() throws IOException {
		super();
	}
	
	HomePage homepage;
	CreateAccountpage createAccountpage;
	String sheetname="customerdetails";
	LoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() throws IOException, InterruptedException {
		initialBrowser();
		homepage=new HomePage();
		createAccountpage=new CreateAccountpage();
		loginPage=new LoginPage();
		
	}
	
	@DataProvider
	public Object[][] getTestData() throws EncryptedDocumentException, IOException {
		Object[][] accdata=Excel_Handling.getTestData(sheetname);
		return accdata;
	}
	
	@Test(dataProvider = "getTestData")
	public void TestCreateaccount_Homepage(String Fname, String Lname, String EmailID, String Pass) throws InterruptedException, IOException {
		homepage.verifyCreateAccount();
		createAccountpage.verifycreateaccount(Fname, Lname, EmailID, Pass);
	}
	
	
}

