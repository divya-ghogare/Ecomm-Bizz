package launch_browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver=new ChromeDriver();
		
		//WebDriver driver1=new FirefoxDriver();
		
	    //	WebDriver driver2=new EdgeDriver();
		
		
		
/*
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    
	    Thread.sleep(2000);
	    driver.quit();
	    */
	    //to navigate 
		
	    WebDriver driver1=new ChromeDriver();
	    driver1.manage().window().minimize();
	    driver1.get("https://www.facebook.com");
	    Thread.sleep(3000);
	    driver1.navigate().to("https://www.google.com");
	    Thread.sleep(3000);
	    driver1.navigate().back();  //to go back
	    Thread.sleep(3000);
	    driver1.navigate().forward();
	    Thread.sleep(3000);
	    driver1.navigate().refresh();
	    Thread.sleep(3000);
	    driver1.quit();
	}
}


