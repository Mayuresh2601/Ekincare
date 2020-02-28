package com.ekincare.androidautomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HomeTest extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}
	
	@SuppressWarnings({ "rawtypes", "static-access" })
	@Test(priority = 0)
	public void gymAndFitness() {
		
		System.out.println("Inside Gym and Fitness Scenario from Home Page Test");
		try {
			
			login.talkWithFamilyCredentials();
		
			MobileElement gymAndFitness  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]"));
			gymAndFitness.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gym_row_view")).click();
			Thread.sleep(2000);

			utility.swipeScreen();
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			Thread.sleep(3000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.gym.GymSessionStausActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 1)
	public void medicineNameWithAddressSelf() {
		
		System.out.println("Inside Order Medicines By Name with Address Scenario for Self in Home Page Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/otc_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.EditText")).click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.EditText")).sendKeys("crocin");
			driver.hideKeyboard();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText")).sendKeys("5");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/continue_medicines")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.health.precipitation.activity.PlaceMedicineSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 2)
	public void scheduleAppointment() {
		
		System.out.println("Inside Talk with Family Doctor Schedule Appointment in Home Page Test");
		try {

			login.talkWithFamilyCredentials();
			
			MobileElement talkWithFamilyDoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]"));
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
			.perform();
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number")).sendKeys("1234567890");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/view_payment_details")).click();
			Thread.sleep(1000);
			System.out.println(driver.currentActivity());
			
		} catch (Exception e) {
			
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3)
	public void talkWithDoctorSelf() {
		
		System.out.println("Inside Talk with Doctor Scenario for Self in Home PageTest");
		try {
			
			login.talkWithDocCredentials();
			
			MobileElement talkWithDoctor = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]"));
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
	
	@Test(priority = 4)
	public void viewAll() {
		
		System.out.println("Inside View All Button to Benefits Page Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement viewAll = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]"));
			viewAll.click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.MainActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	public void home() {
		
		System.out.println("Inside View All Button to Benefits Page Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement home = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"DASHBOARD\"]"));
			home.click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.MainActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public void health() {
		
		System.out.println("Inside health Page from Button Page Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement health = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			health.click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.MainActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 7)
	public void benefits() {
		
		System.out.println("Inside Benefits Page from Button Page Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement viewAll = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Benefits\"]"));
			viewAll.click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.MainActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 8)
	public void improve() {
		
		System.out.println("Inside Improve Page from Button Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement viewAll = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			viewAll.click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.MainActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 8)
	public void notifications() {
		
		System.out.println("Inside Notification Page from Button Test");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement notifications = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"NOTIFICATION\"]"));
			notifications.click();
			Thread.sleep(1000);

			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.MainActivity";
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
