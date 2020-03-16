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

public class VirtualDevice extends BaseTest{
	
	@BeforeTest
	public void beginTest() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "iPhone 7");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "13.3");
		cap.setCapability("app", "/Users/ekincare/Desktop/demo/build/Release-iphonesimulator/demo.app");
		cap.setCapability("noReset", true);
		cap.setCapability("automationName", "XCUITest");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new IOSDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void realDevice() {
		
		System.out.println("Inside Test Method");
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}
}