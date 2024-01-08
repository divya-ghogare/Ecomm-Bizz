package iterators;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Iterator {

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
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		Set<String> windowList = driver.getWindowHandles();
		
		java.util.Iterator<String> itr = windowList.iterator();
		String window1=itr.next();//parent window
		String window2=itr.next();//child window
		
		driver.switchTo().window(window2);
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
