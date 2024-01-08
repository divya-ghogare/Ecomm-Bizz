package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utiility_01 {

	public static WebDriver driver;
	
	public static void screenshot(String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../SeleniumPractice/CapturedScreenshot1/"+screenshotname+".png");
				FileHandler.copy(source, target);
	}
	}
	
