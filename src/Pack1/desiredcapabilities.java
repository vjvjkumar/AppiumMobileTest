package Pack1;
import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


public class desiredcapabilities {

	@Test
	public void test() throws MalformedURLException {
		
				File appDir = new File ("src");
		
				File app = new File(appDir, "bookMyShow-ucb.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	}

}
