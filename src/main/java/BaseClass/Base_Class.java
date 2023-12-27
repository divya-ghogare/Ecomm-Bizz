package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Utility.WebeventLogger;
@SuppressWarnings("deprecation")
public class Base_Class {
   public static WebDriver driver;
   public static Properties prop;
   public static WebeventLogger logger;
   public static EventFiringWebDriver firingdriver;
   FileInputStream fis;
   
   public Base_Class() throws IOException {
	   prop=new Properties();
	   fis=new FileInputStream("../ITECH_Magento_Project1/src/main/java/Utility/config.properties");
	   prop.load(fis);
	   
   }
 
   
   
	public void initialBrowser() throws IOException {
		driver=new ChromeDriver();
		logger=new WebeventLogger();
		firingdriver=new EventFiringWebDriver(driver);
		firingdriver.register(logger);
		driver=firingdriver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("baseUrl"));
	}
	
	public void CloseBowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
