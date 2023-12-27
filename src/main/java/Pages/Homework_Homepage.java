package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseClass.Base_Class;

public class Homework_Homepage extends Base_Class{

	public Homework_Homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a#ui-id-5") WebElement selectmen;
    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[5]") WebElement tops;
    @FindBy(id = "ui-id-20") WebElement jacket;
    @FindBy(xpath = "//div[@id='product-item-info_278']") WebElement summitKit;
    @FindBy(id = "option-label-size-157-item-171") WebElement size;
    @FindBy(id = "option-label-color-93-item-58") WebElement colour;
    @FindBy(id = "product-addtocart-button") WebElement AddtoCart;
    
    public newpage SelectMen() throws InterruptedException {
    	Actions act=new Actions(driver);
    	act.moveToElement(selectmen).build().perform();
    	
    	Thread.sleep(200);
    	act.moveToElement(tops).build().perform();
    	
    	Thread.sleep(200);
    	jacket.click();
    	return new newpage();
    	
    }
    
    public newpage clickSummitKit() {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0, 200)");
    	summitKit.click();
    	return new newpage();
    }
    
    public newpage clickAddtoCart() throws InterruptedException {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0, 200)");
    	size.click();
    	Thread.sleep(2000);
    	colour.click();
    	Thread.sleep(2000);
    	AddtoCart.click();
    	return new newpage();
    }
   
}
