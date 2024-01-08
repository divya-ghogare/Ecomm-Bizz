package logins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Acc_Facebook {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     WebElement Create_Acc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
     Create_Acc.click();
     
     WebElement firstname= driver.findElement(By.name("firstname"));
     firstname.sendKeys("george");
     
     WebElement lastname= driver.findElement(By.name("lastname"));
     lastname.sendKeys("washington");
     
     WebElement email=driver.findElement(By.name("reg_email__"));
     email.sendKeys("georgewashington@gmail.com");

     WebElement Re_email=driver.findElement(By.name("reg_email_confirmation__"));
     Re_email.sendKeys("georgewashington@gmail.com");
     
     WebElement password=driver.findElement(By.name("reg_passwd__"));
     password.sendKeys("geaorge@12344");
     
     WebElement Birthdate=driver.findElement(By.name("birthday_day"));
     Birthdate.sendKeys("27");
     
     WebElement Birthmonth=driver.findElement(By.name("birthday_month"));
     Birthmonth.sendKeys("Sep");
     
     
     WebElement Birthyear=driver.findElement(By.name("birthday_year"));
     Birthyear.sendKeys("1999");
     
     WebElement gendar=driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]"));
     gendar.click();
     
     
     
     }

}
