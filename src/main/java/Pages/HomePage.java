package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class HomePage extends Base_Class{

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='logo']/img") WebElement logoImg;
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]") WebElement signIn;
	@FindBy(xpath = "(//button[@class='action switch'])[1]") WebElement CreatenewAccount;
	@FindBy(xpath = "(//a[text()='Create New Customer'])[1]") WebElement CreateCustomer;
	
	public String verifypageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		return logoImg.isDisplayed();
	}
	
	public LoginPage verifySignin() throws IOException {
		signIn.click();
		return new LoginPage();
	}
	
	public CreateAccountpage verifyCreateAccount() throws InterruptedException, IOException {
		Thread.sleep(4000);
		CreatenewAccount.click();
		Thread.sleep(4000);
		CreateCustomer.click();
		
		return new CreateAccountpage();
	}

}
