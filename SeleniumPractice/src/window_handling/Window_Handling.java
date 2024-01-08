package window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement career=driver.findElement(By.xpath("//*[@href='http://careers.infoedge.in/']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", career);
		career.click();
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandles());
		
		Set<String> windowList = driver.getWindowHandles();
		
		
		for(String window:windowList) {
			driver.switchTo().window(window);
		}
		
		
		

		
	}

}
