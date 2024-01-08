package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clickbtn=driver.findElement(By.xpath("//button[@onClick='alertbox()']"));
		clickbtn.click();
		
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		
		Thread.sleep(3000);
		simpleAlert.accept();
		
	}

}
