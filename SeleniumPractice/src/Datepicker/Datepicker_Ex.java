package Datepicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_Ex {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	
	WebElement datebox=driver.findElement(By.cssSelector("input#datepicker"));
	datebox.click();
	
	WebElement date=driver.findElement(By.cssSelector("div.ui-datepicker-title"));
	
	WebElement prevbtn=driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']"));
	prevbtn.click();
	int dt = 16;
	while(true) {
		
		String date1=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(date1);
		
		if((date1.equals("June 2022"))) {
			break;
		}else {
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
	}

	WebElement datemonth=driver.findElement(By.xpath("//a[text()='"+dt+"']"));
		datemonth.click();
		
	
}
}
