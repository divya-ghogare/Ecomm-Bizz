package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_ClassHW {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Actions act=new Actions(driver);
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		Thread.sleep(6000);
		
		act.sendKeys(username,Keys.TAB).sendKeys("admin123").sendKeys(Keys.ENTER).build().perform();	
		Thread.sleep(6000);
		driver.quit();
	}

}
