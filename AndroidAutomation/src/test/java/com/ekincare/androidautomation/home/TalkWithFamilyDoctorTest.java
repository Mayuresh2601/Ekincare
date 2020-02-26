package com.ekincare.androidautomation.home;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
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
	
	@Test(priority = 0)
	public void aboutDoctor() {
		
		System.out.println("Inside Talk with Family Doctor");
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
			email.sendKeys("m16test@yopmail.com");
			Thread.sleep(1000);
			MobileElement nextBtn = driver.findElement(By.id("com.ekincare.development:id/register_next_view"));
			nextBtn.click();
			Thread.sleep(1000);
			MobileElement password = driver.findElement(By.id("com.ekincare.development:id/password_set"));
			password.sendKeys("ekincare123");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/terms_condition_check")).click();
			Thread.sleep(1000);
			MobileElement nextBTN = driver.findElement(By.id("com.ekincare.development:id/otp_next_view"));
			nextBTN.click();
			Thread.sleep(1000);
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			MobileElement aboutDoc = driver.findElement(By.id("com.ekincare.development:id/doctor_info_cardView"));
			aboutDoc.click();
			Thread.sleep(1000);
			Assert.assertEquals(driver.getTitle(), "com.ekincare.development:id/doctor_info_cardView");
			
			
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "static-access" })
//	@Test(priority = 1)
	public void scheduleAppointment() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment");
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
			email.sendKeys("testfeb24920@yopmail.com");
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
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[1]")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(680, 1620))
			.moveTo(PointOption.point(680, 1020))
			.release()
			.perform();
			
			Thread.sleep(1000);
			
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
//	@Test(priority = 2)
	public void addToCalender() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment and Add to Calender");
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
			email.sendKeys("testfeb24920@yopmail.com");
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
			action1.press(PointOption.point(680, 1620))
			.moveTo(PointOption.point(680, 1020))
			.release()
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
			
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 3)
	public void scheduleAppointmentPlusReschedule() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment then Reschedule Appointment");
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
			email.sendKeys("testfeb24920@yopmail.com");
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
			action1.press(PointOption.point(680, 1620))
			.moveTo(PointOption.point(680, 1020))
			.release()
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
			action2.press(PointOption.point(680, 1620))
			.moveTo(PointOption.point(680, 1020))
			.release()
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
	
	
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 4)
	public void scheduleAppointmentPlusCancel() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment Plus Cancel Appointment");
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
			email.sendKeys("testfeb24920@yopmail.com");
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
			action1.press(PointOption.point(680, 1620))
			.moveTo(PointOption.point(680, 1020))
			.release()
			.perform();
			
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
		
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/cancel_appointment")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/cancel_textview")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 5)
	public void SchedulePlusReschedulePlusCancelAppointment() {
		
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
			email.sendKeys("testfeb24920@yopmail.com");
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
			action1.press(PointOption.point(680, 1620))
			.moveTo(PointOption.point(680, 1020))
			.release()
			.perform();
			
			Thread.sleep(1000);
			
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
				action2.press(PointOption.point(680, 1620))
				.moveTo(PointOption.point(680, 1020))
				.release()
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
				}
			}
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
//	@Test(priority = 6)
	public void BookAppointmentWithFamilyMember() {
		
		System.out.println("Inside Talk with Family Doctor with Family Member and About Doctor");
		
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
			email.sendKeys("testfeb24920@yopmail.com");
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
			
			MobileElement benefits = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			benefits.click();
			Thread.sleep(1000);
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			talkWithFamilyDoc.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/schedule_call_imageview")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[10]")).click();
			Thread.sleep(1000);
			
			List<MobileElement> icons = driver.findElements(By.id("com.ekincare.development:id/customer_logo_icons"));
			if(icons.size() >= 4) {
				
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
				Thread.sleep(1000);
				
				TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
				action1.press(PointOption.point(680, 1620))
				.moveTo(PointOption.point(680, 1020))
				.release()
				.perform();
				
				MobileElement tnc = driver.findElement(By.id("com.ekincare.development:id/terms_condition_check"));
				tnc.click();	
				Thread.sleep(1000);
				driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
				Thread.sleep(1000);
			
				driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
				Thread.sleep(1000);
				
				TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
				action2.press(PointOption.point(680, 1620))
				.moveTo(PointOption.point(680, 1020))
				.release()
				.perform();
				Thread.sleep(1000);
				
				driver.findElement(By.id("com.ekincare.development:id/doctor_info")).click();
				
			}
			else {
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout["+ icons.size() +"]/android.widget.FrameLayout/android.widget.ImageView")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.id("com.ekincare.development:id/name")).sendKeys("Sudeep Narayan");
				Thread.sleep(1000);
			
				driver.findElement(By.id("com.ekincare.development:id/date_of_birth")).click();
				driver.findElement(By.id("com.ekincare.development:id/date_of_birth")).click();
				
				MobileElement okBtn = driver.findElement(By.id("android:id/button1"));
				okBtn.click(); 
				Thread.sleep(1000);
				
				driver.findElement(By.id("android:id/text1")).click();
				MobileElement father = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
				father.click();
				Thread.sleep(1000);
				
				driver.findElement(By.id("com.ekincare.development:id/add_member")).click();
				Thread.sleep(1000);
				
				TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
				action1.press(PointOption.point(680, 1620))
				.moveTo(PointOption.point(680, 1020))
				.release()
				.perform();
				
				driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
				Thread.sleep(1000);
			
				driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
				Thread.sleep(1000);
				
				TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
				action2.press(PointOption.point(680, 1620))
				.moveTo(PointOption.point(680, 1020))
				.release()
				.perform();
				Thread.sleep(1000);
				
				driver.findElement(By.id("com.ekincare.development:id/doctor_info")).click();
			}
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