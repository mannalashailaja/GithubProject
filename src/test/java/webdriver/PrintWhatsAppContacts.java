package webdriver;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class PrintWhatsAppContacts {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws InterruptedException {
	  TouchAction t = new TouchAction(driver);
	  t.tap(ElementOption.point(958,2073)).release().perform();
	  List<WebElement> str= driver.findElements(By.id("com.whatsapp:id/contactpicker_row_name"));
		 System.out.println(str.size());
	for(int p=0; p<16; p++){
	  str= driver.findElements(By.id("com.whatsapp:id/contactpicker_row_name"));
	// System.out.println(str.size());
	 for(int i=0; i<str.size(); i++){
		 System.out.println(str.get(i).getText());
	 }
	 t.press(ElementOption.point(189,1922)).waitAction().moveTo(ElementOption.point(189,599)).release().perform();
	Thread.sleep(1000);
	}
	}
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
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
  public void afterTest() {
  }

}
