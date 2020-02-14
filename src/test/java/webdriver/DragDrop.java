package webdriver;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class DragDrop {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  TouchAction t = new TouchAction(driver);
	  t.longPress(ElementOption.point(322,1228)).moveTo(ElementOption.point(408,565)).release().perform();
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "a50468bc7ce5");
	  dc.setCapability("platformVersion", "7.1.2");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.sec.android.app.launcher");
	  dc.setCapability("appActivity", "com.sec.android.app.launcher.activities.LauncherActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
  }

  @AfterTest
  public void afterTest() {
  }

}
