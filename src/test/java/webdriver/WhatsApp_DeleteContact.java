package webdriver;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class WhatsApp_DeleteContact {
	 AndroidDriver<WebElement> driver ;
  @Test
  public void f() {
	 
	  WebElement e1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Shailaja Class Frnd']"));
	  TouchAction t = new TouchAction(driver);
	 
	  t.longPress(ElementOption.element(e1)).release().perform();
	  t.tap(ElementOption.point(647,158)).release().perform();
	  driver.findElement(By.xpath("//android.widget.Button[@text='DELETE']")).click();
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






