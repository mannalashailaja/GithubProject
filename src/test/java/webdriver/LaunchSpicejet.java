package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class LaunchSpicejet {
  @Test
  public void f() throws Exception {
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setCapability("deviceName", "RZ8M322GCEJ");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	//  WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	// IOSDriver<WebElement> driver1= new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
  }
}

















