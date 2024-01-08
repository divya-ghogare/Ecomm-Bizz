package iterators;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator_hw {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement career=driver.findElement(By.xpath("//*[@href='http://careers.infoedge.in/']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", career);
		
		System.out.println(driver.getCurrentUrl()); //get parent window url
		System.out.println(driver.getWindowHandle()); //get unique id for parent
		System.out.println(driver.getWindowHandles()); //get unique id of prent +child
		
		Set<String> windowList = driver.getWindowHandles();
		
		Iterator<String> itr = windowList.iterator();
		String window1=itr.next(); // naukri
		String window2=itr.next(); //info edge
		
		WebElement jeevansathi=driver.findElement(By.xpath("//*[@href='https://www.jeevansathi.com/']"));
		
        JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", jeevansathi);
		
		System.out.println(driver.getWindowHandle()); //get unique id for parent
		System.out.println(driver.getWindowHandles()); 
		
		Set<String> windowList1 = driver.getWindowHandles();
		Iterator<String> itrr = windowList1.iterator();
        String window3=itrr.next(); //naukri
        String window4=itrr.next(); //info edge
        String window5=itrr.next(); //jeevansathi
		driver.switchTo().window(window5);
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}

}
