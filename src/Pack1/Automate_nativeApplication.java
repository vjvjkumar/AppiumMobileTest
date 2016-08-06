package Pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Automate_nativeApplication 
{
		private static AndroidDriver driver;
		 
		public static void main(String[] args) throws MalformedURLException, InterruptedException 
{		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "My New Phone");
			capabilities.setCapability("platformVersion", "4.4.2");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "io.selendroid.testapp");
			capabilities.setCapability("appActivity", ".HomeScreenActivity");
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"), capabilities);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Vijay Selenium Appium");
			driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
			Thread.sleep(10000);
			driver.quit();
		 
}
}


