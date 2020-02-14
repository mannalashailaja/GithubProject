package webdriver;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class SpicejetSearch {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")).sendKeys("ben");
	  driver.findElement(By.xpath("//android.widget.TextView[@text='BLR - Bengaluru, India']")).click();
	  
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView[2]")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter airport code/city']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter airport code/city']")).sendKeys("del");
	  driver.findElement(By.xpath("//android.widget.TextView[@text='DEL - Delhi, India']")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup")).click();
	  driver.findElement(By.xpath("(//android.widget.TextView[@text='12'])[2]")).click();

	  driver.findElement(By.xpath("//android.widget.TextView[@text='1 Traveller']")).click();
	  
	  driver.findElement(By.xpath("//android.widget.TextView[@text='3' and @index='6']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='2' and @index='17']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='1' and @index='23']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Search Flights']")).click();

  }
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities dc =new DesiredCapabilities();
	  dc.setCapability("deviceName", "RZ8M322GCEJ");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true); 
	  driver= new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}














