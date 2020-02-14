package webdriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class NewTest {
	 AndroidDriver<WebElement> driver ;
	@Test
	  public void f() throws Exception {
		 
		  WebElement e1 = driver.findElement(By.id("com.whatsapp:id/icon"));
		 e1.click();
		 Thread.sleep(2000);
		 TouchAction t=new TouchAction(driver);
		 t.press(ElementOption.point(861,1233)).moveTo(ElementOption.point(143,1401)).release().perform();
		Thread.sleep(2000);
		 WebElement chats = driver.findElement(By.xpath("//android.widget.TextView[@text='CHATS']"));
		 chats.click();
		 WebElement status = driver.findElement(By.xpath("//android.widget.TextView[@text='STATUS']"));
		 status.click();
		 WebElement calls = driver.findElement(By.xpath("//android.widget.TextView[@text='CALLS']"));
		 calls.click();
		  
	  }
	  @BeforeTest
	  public void beforeTest() throws Exception {
		  DesiredCapabilities dc=new DesiredCapabilities();
		  dc.setCapability("deviceName", "RZ8M322GCEJ");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("appPackage", "com.whatsapp");
		  dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
		  dc.setCapability("fullReset", false);
		  dc.setCapability("noReset", true);
		  driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.quit();
	  }
}
