package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Actions act=new Actions(driver);
		
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("abc@gmail.com");
		
		Thread.sleep(3000);
		
		act.sendKeys(email,Keys.TAB).sendKeys("abc@123").sendKeys(Keys.ENTER).build().perform(); 
		Thread.sleep(3000);
		
		driver.quit();
	}

}
