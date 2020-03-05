package com.ekincare.androidautomation.benefits;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;
import com.ekincare.androidautomation.utility.CustomListner;

import io.appium.java_client.MobileElement;

@Listeners(CustomListner.class)
public class DentalCheckupTest extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}
	
	@Test(priority = 32)
	public  void dentalCheckup() {
		
		System.out.println("Inside Dental Checkup Activity");
		
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement dentalCheckup = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]"));
			dentalCheckup.click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.ui.bookpackage.sponsorpackage.SponsorPackageActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
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