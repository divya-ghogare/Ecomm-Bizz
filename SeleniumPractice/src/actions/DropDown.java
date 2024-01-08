package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mailchimp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement signup=driver.findElement(By.xpath("//a[@aria-label='Sign Up']"));
		signup.click();
		
		WebElement drop_down=driver.findElement(By.id("all_plans_contacts_select"));
        Select selectdropdown=new Select(drop_down);
        selectdropdown.selectByIndex(4);
        Thread.sleep(3000);
        selectdropdown.selectByValue("6");
        Thread.sleep(3000);
        selectdropdown.selectByVisibleText("10,000");

	}

}
