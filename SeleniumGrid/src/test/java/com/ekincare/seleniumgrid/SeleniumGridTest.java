package com.ekincare.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumGridTest extends BaseTest {
	

	@BeforeTest
	public void beginTest() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
//		caps.setPlatform(Platform.MAC);
		caps.setPlatform(Platform.WIN10);
		
		
		ChromeOptions options = new ChromeOptions();
		options.merge(caps);
		
		
		URL url = new URL("http://192.168.20.122:4444/wd/hub");
		
		driver = new RemoteWebDriver(url, options);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void sample() {
		
		driver.get("https://www.facebook.com");
		driver.getTitle();
	}
	
	
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.close();
	}
}
