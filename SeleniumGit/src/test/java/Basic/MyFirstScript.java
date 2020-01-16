package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstScript {
	
@Test
public void test() throws InterruptedException
{
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Downloads/geckodriver/");
	//System.setProperty("webdriver.chrome.driver", "/home/ranjeet/Downloads/chromedriver/");
	
	 driver=new FirefoxDriver();
	//driver=new ChromeDriver();
	driver.get("http://petbiotechweb.agritechie.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("employee_01@example.com");
    Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("My First Script");
}

}
