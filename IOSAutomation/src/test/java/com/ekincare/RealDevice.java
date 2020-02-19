package com.ekincare;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class RealDevice extends BaseTest {
	
	@Test
	public void beginTest() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "iPhone 11");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "13.2");
		cap.setCapability("UDID", "00008030-000965323C92802E");
		cap.setCapability("app", "/Users/ekincare/Desktop/ekincare.app");
		
		cap.setCapability("xcodeSigningId", "iPhone Developer");
		cap.setCapability("updateWDABundleId", "com.mayuresh123.WebDriverAgentRunner");
		cap.setCapability("noReset", true);
		cap.setCapability("automationName", "XCUITest");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new IOSDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
//	@Test
//	public void realDevice() {
//		
//		
//	}
//	
//	@AfterTest
//	public void endTest() {
//		
//		
//	}

}
