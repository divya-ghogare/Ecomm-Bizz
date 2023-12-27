package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Images {
	
	public static void takescreen_failure(WebDriver driver,String screenshotname) throws Throwable{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../ITECH_Magento_Project1/FailedTestCases/"+screenshotname+".png");
		FileHandler.copy(src, target);	
}
	
	public static void takescreen_passed(WebDriver driver,String screenshotname) throws Throwable{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../ITECH_Magento_Project1/PassedTestCases/"+screenshotname+".png");
		FileHandler.copy(src, target);
	}
}
