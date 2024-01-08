package actions;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Action {
	// 1) scrolling by pixel value== window.scrollBy
	// 2) scroll by webelement == "argument[0].scrollIntoView().webelement"

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy (0,2000)");  //scrolldown
		Thread.sleep(2000);
		js.executeScript("window.scrollBy (0,-1000)");  //scrollup
		
}
}