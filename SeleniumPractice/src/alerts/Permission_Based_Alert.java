package alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Based_Alert {
	
	

public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("disable-notification");  //have to pass argument
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Thread.sleep(3000);
	driver.quit();
	
	
}

}
