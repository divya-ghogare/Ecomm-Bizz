package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste_ActionHw {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		
	    WebElement newAcc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    newAcc.click();
	    WebElement firstname=driver.findElement(By.name("firstname"));
	    firstname.sendKeys("stephen");
	    Thread.sleep(3000);
	    WebElement email=driver.findElement(By.name("reg_email__"));
	     email.sendKeys("stephen@gmail.com");
	     WebElement password=driver.findElement(By.name("reg_passwd__"));

	    act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).
	    keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	    
	    act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).
	    keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	    
	    act.keyDown(password,Keys.CONTROL).sendKeys("v").build().perform();
        
	}

}
