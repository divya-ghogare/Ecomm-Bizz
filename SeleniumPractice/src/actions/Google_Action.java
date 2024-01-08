package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement lang=driver.findElement(By.xpath("//a[text()='हिन्दी']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(lang).build().perform();
		driver.findElement(By.xpath("//a[text()='हिन्दी']")).click();
		
		WebElement searchbox=driver.findElement(By.id("APjFqb"));
		act.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("amazon").build().perform();
		Thread.sleep(6000);
		
		//act.moveToElement(searchbox).keyDown(Keys.BACK_SPACE).build().perform();
		//act.doubleClick(searchbox).keyDown(Keys.DELETE).keyUp(Keys.DELETE).build().perform();
		//searchbox.clear():
		act.keyDown(searchbox,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		driver.quit();
	}

}
