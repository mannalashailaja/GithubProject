package webdriverJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
WebDriver driver;
	@Test
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	      driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://selenium4testing.com/hms/");
			Thread.sleep(2000);
			  driver.quit();

	}	
}
