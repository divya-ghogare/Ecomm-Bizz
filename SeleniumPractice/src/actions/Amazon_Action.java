package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        WebElement lang=driver.findElement(By.id("icp-nav-flyout"));
        Actions act=new Actions(driver);
        act.moveToElement(lang).build().perform();
        driver.findElement(By.xpath("//span[text()='हिन्दी'][1]")).click();
        
        Thread.sleep(3000);
        WebElement acclist=driver.findElement(By.id("nav-link-accountList"));
        act.moveToElement(acclist).build().perform();
        WebElement youracc=driver.findElement(By.xpath("//span[text()='Your Account']"));
        youracc.click();
        
        act.moveToElement(youracc).contextClick().build().perform();
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        act.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("mobiles").build().perform();        
        Thread.sleep(3000);
        driver.quit();
        
        
        
	}

}
