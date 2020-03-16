package com.ekincare.androidautomation.improve;

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
public class EventsTest extends BaseTest {

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}

	@Test(priority = 61)
	public void goingEvent() {

		System.out.println("Inside Going Event and Checking in Registred Event");
		try {

			login.talkWithFamilyCredentials();

			MobileElement improve = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			improve.click();
			Thread.sleep(1000);

			MobileElement events = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[2]"));
			events.click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
			Thread.sleep(1000);

			driver.findElement(By.id("com.ekincare.development:id/event_detail_going")).click();
			Thread.sleep(10000);

			driver.findElementByAccessibilityId("Navigate up").click();
			Thread.sleep(1000);
			driver.findElementByAccessibilityId("Registered").click();
			Thread.sleep(1000);
		
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout")).click();
			Thread.sleep(1000);

			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.ui.event.EventDetailsActivity";
			assertEquals(actualResult, expectedResult);

		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 62)
	public void notGoingEvent() {

		System.out.println("Inside Not Going Event from Registred Event");
		try {

			login.talkWithFamilyCredentials();

			MobileElement improve = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			improve.click();
			Thread.sleep(1000);

			MobileElement events = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[2]"));
			events.click();
			Thread.sleep(1000);
			
			driver.findElementByAccessibilityId("Registered").click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/event_detail_not_going")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.ui.event.EventDetailsActivity";
			assertEquals(actualResult, expectedResult);

		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 63)
	public void notSureEvent() {

		System.out.println("Inside Not Sure Event");
		try {

			login.talkWithFamilyCredentials();

			MobileElement improve = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			improve.click();
			Thread.sleep(1000);

			MobileElement events = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[2]"));
			events.click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RadioGroup/android.widget.RadioButton[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/event_not_sure")).click();
			Thread.sleep(6000);

			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.ui.event.EventDetailsActivity";
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