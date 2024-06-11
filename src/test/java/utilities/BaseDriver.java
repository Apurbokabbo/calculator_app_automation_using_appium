package utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class BaseDriver {
	
	
	public AndroidDriver<AndroidElement> driver;
	
		@BeforeMethod
		public void setDriver() throws MalformedURLException ,InterruptedException {
			File f = new File("src");
			File fs = new File(f, "calculator.apk"); 
			
			
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", "android");
			desiredCapabilities.setCapability("udid", "emulator-5554");
			desiredCapabilities.setCapability("deviceName", "local");
			desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
			desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		 //   desiredCapabilities.setCapability("app", fs.getAbsolutePath());
			URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<AndroidElement>(remoteUrl, desiredCapabilities);
			Thread.sleep(500);
			
				
		}
		
		public AndroidDriver<AndroidElement> getDriver() {
			return this.driver;
		}
		
		@AfterMethod
		public void quitDeiver() {
			driver.quit();
		}
		
		

}
