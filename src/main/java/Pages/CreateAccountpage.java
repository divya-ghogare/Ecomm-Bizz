package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class CreateAccountpage extends Base_Class {

	public CreateAccountpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstname") WebElement firstname;
	@FindBy(id = "lastname") WebElement lastname;
	@FindBy(id = "email_address") WebElement email_address;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "password-confirmation") WebElement passconfrmtion;
	@FindBy(xpath = "(//span[text()='Create an Account'])[3]") WebElement btncreateaccount;
	
	public void verifycreateaccount(String Fname, String Lname, String EmailID, String Pass) throws InterruptedException {
		firstname.sendKeys(Fname);
		lastname.sendKeys(Lname);
		email_address.sendKeys(EmailID);
		password.sendKeys(Pass);
		passconfrmtion.sendKeys(Pass);
		
		Thread.sleep(2000);
		btncreateaccount.click();
		
	}
	
}


