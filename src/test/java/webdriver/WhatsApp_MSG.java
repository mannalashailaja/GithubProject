package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class WhatsApp_MSG {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Krishna Kumari Hostel']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).sendKeys("Welcome");
	  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Send']")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  DesiredCapabilities dc =new DesiredCapabilities();
	  dc.setCapability("deviceName", "RZ8M322GCEJ");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true); 
	  driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}









