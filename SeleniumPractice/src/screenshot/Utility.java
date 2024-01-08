package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void takesscreenshot(WebDriver driver,String filename) throws IOException {
		 TakesScreenshot scrnshts=(TakesScreenshot) driver;
		   File source= scrnshts.getScreenshotAs(OutputType.FILE);
		   File dest=new File("../SeleniumPractice/CapturedScreenshot/"+filename+".png");
		   FileHandler.copy(source, dest);
		
	}

}
