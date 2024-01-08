package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act=new Actions(driver);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']//span"));
		act.clickAndHold(slider).moveByOffset(550, 0).build().perform();	//to go left
		Thread.sleep(3000);
		
		act.clickAndHold(slider).moveByOffset(-250, 0).build().perform();	//to get left back

	}

}
