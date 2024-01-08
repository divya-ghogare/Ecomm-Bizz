package refresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import window_handling.Window_Handling;
public class Class_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement Create_Acc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	     Create_Acc.click();
	     
	     WebElement firstname= driver.findElement(By.name("firstname"));
	     firstname.sendKeys("george");
	     
	     WebElement lastname= driver.findElement(By.name("lastname"));
	     lastname.sendKeys("washington");
	     
	     Thread.sleep(3000);
	     
	    js.executeScript("window.history.go(0)");
	   

	}

}
