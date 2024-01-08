package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste_Action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
		WebElement email=driver.findElement(By.id("email"));
		act.sendKeys(email,"stp@gmail.com").keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		driver.quit();
		}

}
