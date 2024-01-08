package logins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		List<WebElement>allLinks=driver.findElements(By.xpath("a")); 
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {
		System.out.println(link.getText());
		}
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("divyaghogare4@gmail.com");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("momsloving");
		
		WebElement loginBtn= driver.findElement(By.name("login"));
	    loginBtn.click();	
	    
		   
	}

}
