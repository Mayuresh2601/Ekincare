package com.ekincare.androidautomation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.utility.CustomListner;
import com.ekincare.androidautomation.utility.Utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

@Listeners(CustomListner.class)
public class LoginTest extends BaseTest{
	
	Utility utility = new Utility();
	
	@BeforeMethod
	public void beginTest() {
		
		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");

			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 6T");
			caps.setCapability(MobileCapabilityType.UDID, "6d2a00fc");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			caps.setCapability("appPackage", "com.ekincare.development");
			caps.setCapability("appActivity", "com.ekincare.SplashScreenActivity");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
//	@Test(priority = 3)
	public void validUsernameValidPasswordTest() {
		
		try {

			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			MobileElement getStarted = driver.findElement(By.id("com.ekincare.development:id/get_started_Button"));
			getStarted.click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("ashwini@ekincare.com");
			Thread.sleep(1000);
			MobileElement nextBtn = driver.findElement(By.id("com.ekincare.development:id/register_next_view"));
			nextBtn.click();
			Thread.sleep(1000);
			
			MobileElement password = driver.findElement(By.id("com.ekincare.development:id/password_set"));
			password.sendKeys("ekincare123");
			Thread.sleep(1000);
			MobileElement nextBTN = driver.findElement(By.id("com.ekincare.development:id/otp_next_view"));
			nextBTN.click();
			Thread.sleep(1000);
			MobileElement dismiss = driver.findElement(By.id("com.ekincare.development:id/tv_dismiss"));
			dismiss.click();
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("static-access")
	@Test(priority = 0)
	public void validUsernameInvalidPasswordTest() {
		
		try {

			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			MobileElement getStarted = driver.findElement(By.id("com.ekincare.development:id/get_started_Button"));
			getStarted.click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("ashwini@ekincare.com");
			Thread.sleep(1000);
			MobileElement nextBtn = driver.findElement(By.id("com.ekincare.development:id/register_next_view"));
			nextBtn.click();
			Thread.sleep(1000);
			
			MobileElement password = driver.findElement(By.id("com.ekincare.development:id/password_set"));
			password.sendKeys("ekincare123456");
			Thread.sleep(1000);
			MobileElement nextBTN = driver.findElement(By.id("com.ekincare.development:id/otp_next_view"));
			nextBTN.click();
		
			System.out.println("Reading Image");
			String imageText = utility.readImage();
			
			System.out.println("Image content is: "+imageText);
			
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
//	@Test(priority = 1)
	public void invalidUsernameValidPasswordTest() {
		
		try {

			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			MobileElement getStarted = driver.findElement(By.id("com.ekincare.development:id/get_started_Button"));
			getStarted.click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("ashwiniiii@ekincare.com");
			Thread.sleep(1000);
			MobileElement nextBtn = driver.findElement(By.id("com.ekincare.development:id/register_next_view"));
			nextBtn.click();
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
//	@Test(priority = 2)
	public void invalidUsernameInvalidPasswordTest() {
		
		try {

			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			MobileElement getStarted = driver.findElement(By.id("com.ekincare.development:id/get_started_Button"));
			getStarted.click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("ashwiniiii@ekincare.com");
			Thread.sleep(1000);
			MobileElement nextBtn = driver.findElement(By.id("com.ekincare.development:id/register_next_view"));
			nextBtn.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void endTest() {
		
		try {
			
			Thread.sleep(4000);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}