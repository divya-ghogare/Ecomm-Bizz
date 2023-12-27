package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class LoginPage extends Base_Class{

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email") WebElement email;
	@FindBy(id="pass") WebElement password;
	@FindBy(id="send2") WebElement btnSignin;
	@FindBy(xpath = "//span[text()='Customer Login']") WebElement customerLoginText;
	@FindBy(xpath = "(//span[text()='Create an Account'])[3]") WebElement btnCreateAccount;
	
	public HomePage verifyLogin() throws IOException {
		email.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		btnSignin.click();
		
		return new HomePage();
	}
	
	public String verifyLoginText() {
		return customerLoginText.getText();
	}
	
	public CreateAccountpage verifybtnCreateAccount() throws IOException {
		btnCreateAccount.click();
		return new CreateAccountpage();
	}

}
