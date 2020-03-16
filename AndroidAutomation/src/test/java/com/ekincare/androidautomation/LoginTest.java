package com.ekincare.androidautomation;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.utility.CustomListner;

import io.appium.java_client.MobileElement;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

@Listeners(CustomListner.class)
public class LoginTest extends BaseTest{
	
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	
	@Test(priority = 3)
	public void validUsernameValidPasswordTest() {
		
		try {

			login.talkWithFamilyCredentials();
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.oneclick.ekincare.MainActivity";
			assertEquals(actualResult, expectedResult);
			
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
			email.sendKeys("testfeb24320@yopmail.com");
			Thread.sleep(1000);
			MobileElement nextBtn = driver.findElement(By.id("com.ekincare.development:id/register_next_view"));
			nextBtn.click();
			Thread.sleep(1000);
			
			MobileElement password = driver.findElement(By.id("com.ekincare.development:id/password_set"));
			password.sendKeys("ekincare");
			Thread.sleep(1000);
			MobileElement nextBTN = driver.findElement(By.id("com.ekincare.development:id/otp_next_view"));
			nextBTN.click();
	
			Thread.sleep(500);
			String screenShot = utility.getScreenShots();
			File imageFile = utility.readImage(screenShot);
			 
	        // get the Tesseract direct interace
	        Tesseract instance = new Tesseract();
	        File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts
			instance.setDatapath(tessDataFolder.getAbsolutePath()); // sets tessData
	 
	        // the doOCR method of Tesseract will retrive the text
	        // from image captured by Selenium
	        String result = instance.doOCR(imageFile);
	        
	        // check the the result
	        Assert.assertTrue(result.contains("Invalid Credentials"));
			
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	@Test(priority = 1)
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
			
			Thread.sleep(500);
			String screenShot = utility.getScreenShots();
			File imageFile = utility.readImage(screenShot);
			 
	        // get the Tesseract direct interace
	        Tesseract instance = new Tesseract();
	        File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts
			instance.setDatapath(tessDataFolder.getAbsolutePath()); // sets tessData
	 
	        // the doOCR method of Tesseract will retrive the text
	        // from image captured by Selenium
	        String result = instance.doOCR(imageFile);
	        
	        // check the the result
	        Assert.assertTrue(result.contains("Enter your company code"));
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	@SuppressWarnings("static-access")
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
			
			Thread.sleep(500);
			String screenShot = utility.getScreenShots();
			File imageFile = utility.readImage(screenShot);
			 
	        // get the Tesseract direct interace
	        Tesseract instance = new Tesseract();
	        File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts
			instance.setDatapath(tessDataFolder.getAbsolutePath()); // sets tessData
	 
	        // the doOCR method of Tesseract will retrive the text
	        // from image captured by Selenium
	        String result = instance.doOCR(imageFile);
	        
	        // check the the result
	        Assert.assertTrue(result.contains("Enter your company code"));
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void endTest() {
		
		utility.quit_Driver();
	}
}