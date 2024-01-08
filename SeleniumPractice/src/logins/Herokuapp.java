package logins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement FormAuth=driver.findElement(By.linkText("Form Authentication"));
		FormAuth.click();
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("georgeswain");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("geaorge@123");
		
		
	}

}
