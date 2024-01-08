package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		WebElement cnfrmbtn=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		cnfrmbtn.click();
		
		Alert confirmalert=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.accept();

	}

}
