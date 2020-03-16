package com.ekincare.androidautomation.benefits;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;
import com.ekincare.androidautomation.utility.CustomListner;

import io.appium.java_client.MobileElement;

@Listeners(CustomListner.class)
public class TalkWithDoctorTest extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}
	
	
	@Test(priority = 40)
	public void talkWithDoctorSelf() {
		
		System.out.println("Inside Talk with Doctor Scenario for Self Test");
		try {
			
			login.talkWithDocCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithDoctor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithDoctor.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.ekincare.development:id/start_consultation_text")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("com.ekincare.development:id/cancel_family_doctor_request")).click();
			Thread.sleep(2000);

			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.FamilyDoctorChatActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 41)
	public void talkWithDoctorFamily() {
		
		System.out.println("Inside Talk with Doctor Scenario for Family Test");
		try {
			
			login.talkWithDocCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithDoctor  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithDoctor.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/select_member")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/terms_condition_check")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/move_med_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.ekincare.development:id/start_consultation_text")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("com.ekincare.development:id/cancel_family_doctor_request")).click();
			Thread.sleep(2000);

			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.FamilyDoctorChatActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access" })
//	@Test(priority = 42)
	public void talkWithDoctorAddFamily() {
		
		System.out.println("Inside Talk with Doctor Scenario to Add Family Member Test");
		try {
			
			login.talkWithDocCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithDoctor  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithDoctor.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/select_member")).click();
			Thread.sleep(5000);
			
			List<MobileElement> icons = driver.findElements(By.id("com.ekincare.development:id/customer_logo_icons"));
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout["+ icons.size() +"]/android.widget.FrameLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/name")).sendKeys("Ashwini Test");
			Thread.sleep(1000);
			
			MobileElement dateOfBirth = driver.findElement(By.id("com.ekincare.development:id/date_of_birth"));
			dateOfBirth.click();
			dateOfBirth.click();
			
			driver.findElement(By.id("android:id/date_picker_header_year")).click();
			Thread.sleep(1000);
			
			for (int i = 0; i < 7; i++) {
				
				utility.swipeYear();
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("android:id/text1")).click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/add_member")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/terms_condition_check")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/move_med_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.ekincare.development:id/start_consultation_text")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("com.ekincare.development:id/cancel_family_doctor_request")).click();
			Thread.sleep(2000);

			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.FamilyDoctorChatActivity";
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