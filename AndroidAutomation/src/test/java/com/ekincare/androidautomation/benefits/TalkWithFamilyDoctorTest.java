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
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(CustomListner.class)
public class TalkWithFamilyDoctorTest extends BaseTest{
	
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 43)
	public void scheduleAppointment() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment");
		try {

			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[2]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 44)
	public void addToCalender() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment and Add to Calender");
		try {

			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[3]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
		
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/add_to_calendar_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("android:id/text1")).click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.DoctorConsultationBooked";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
	@Test(priority = 45)
	public void scheduleAppointmentPlusReschedule() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment then Reschedule Appointment");
		try {

			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[4]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
		
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_appointment")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[5]")).click();
			Thread.sleep(1000);
			
			TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
			action2.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
		
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.DoctorConsultationBooked";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings({ "static-access", "rawtypes" })
	@Test(priority = 46)
	public void scheduleAppointmentPlusCancel() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment Plus Cancel Appointment");
		try {

			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[6]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
		
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/cancel_appointment")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/cancel_textview")).click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.DoctorConsultationBooked";
			assertEquals(actualResult, expectedResult);

		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
	@Test(priority = 47)
	public void SchedulePlusReschedulePlusCancelAppointment() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment");
		try {
		
			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[8]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);

			Thread.sleep(8000);
			System.out.println("Inside Notification Reschedule Option");
			MobileElement closeBtn1 = driver.findElement(By.id("com.ekincare.development:id/close_imageview"));
			closeBtn1.click();
			Thread.sleep(1000);
			
			MobileElement backBtn = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
			backBtn.click();
			Thread.sleep(1000);
			
			MobileElement notification = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"NOTIFICATION\"]"));
			notification.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")).click();
			Thread.sleep(1000);

			utility.swipeScreen();
			MobileElement RescheduleBtn = driver.findElement(By.id("com.ekincare.development:id/schedule_appointment"));
			Thread.sleep(1000);
			
			if (RescheduleBtn.isEnabled()) {
				
				RescheduleBtn.click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[9]")).click();
				Thread.sleep(1000);
				
				TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
				action2.press(PointOption.point(680, 1800))
				.moveTo(PointOption.point(680, 1200))
				.perform();
				
				driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
				Thread.sleep(1000);
			
				driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
				Thread.sleep(8000);
				
				MobileElement closeBtn2 = driver.findElement(By.id("com.ekincare.development:id/close_imageview"));
				closeBtn2.click();
				
				System.out.println("Inside Notification Cancel Option");
				MobileElement cancelBtn = driver.findElement(By.id("com.ekincare.development:id/cancel_appointment"));
				
				if (cancelBtn.isEnabled()) {
					
					cancelBtn.click();
					Thread.sleep(1000);
					driver.findElement(By.id("com.ekincare.development:id/cancel_textview")).click();
					Thread.sleep(1000);
					
					actualResult = driver.currentActivity();
					expectedResult = "com.ekincare.familydoctorflow.views.DoctorConsultationBooked";
					assertEquals(actualResult, expectedResult);
				}
			}
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 48)
	public void BookAppointmentWithFamilyMember() {
		
		System.out.println("Inside Talk with Family Doctor with Family Member and About Doctor");
		
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[10]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();

			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);

			MobileElement tnc = driver.findElement(By.id("com.ekincare.development:id/terms_condition_check"));
			tnc.click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);

			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(2000);

			TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
			action2.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			Thread.sleep(1000);

			driver.findElement(By.id("com.ekincare.development:id/doctor_info")).click();

			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.FamilyDoctorAboutInfoActivity";
			assertEquals(actualResult, expectedResult);

		} catch (Exception e) {

			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings({ "static-access", "rawtypes" })
	@Test(priority = 49)
	public void BookAppointmentAddFamilyMember() {
		
		System.out.println("Inside Talk with Family Doctor to Add Family Member");
		
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[11]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1800))
			.moveTo(PointOption.point(680, 1200))
			.perform();
			
			List<MobileElement> icons = driver.findElements(By.id("com.ekincare.development:id/customer_logo_icons"));

			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout["+ icons.size() + "]/android.widget.FrameLayout/android.widget.ImageView")).click();
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

			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);

			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.familydoctorflow.views.DoctorConsultationBooked";
			assertEquals(actualResult, expectedResult);

		} catch (Exception e) {

			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void endTest() throws InterruptedException {
		
		Thread.sleep(5000);
		utility.quit_Driver();
	}
}