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
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(CustomListner.class)
public class ChallengesTest extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 57)
	public void knowMore() {
		
		System.out.println("Inside Know More About Challenege Activity");
		
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement improve = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			improve.click();
			Thread.sleep(1000);
			
			MobileElement challenges = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[1]"));
			challenges.click();
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(800, 2013))
			.moveTo(PointOption.point(800, 1400))
			.perform();
			
			MobileElement knowMore = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[2]"));
			knowMore.click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.ui.challenge.activity.ActivitySocialChallengeDetailPage";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 58)
	public void startChallenges() {
		
		System.out.println("Inside Start Challeneges Activity");
		
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement improve = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			improve.click();
			Thread.sleep(1000);
			
			MobileElement challenges = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[1]"));
			challenges.click();
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(800, 2013))
			.moveTo(PointOption.point(800, 1400))
			.perform();
			
			MobileElement knowMore = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]"));
			knowMore.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/start_challenge")).click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.ui.challenge.activity.ActivitySocialChallengeDetailPage";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 59)
	public void stopChallenges() {
		
		System.out.println("Inside Stop Challeneges Activity");
		
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement improve = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"RISKS\"]"));
			improve.click();
			Thread.sleep(1000);
			
			MobileElement challenges = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[1]"));
			challenges.click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"In Progress\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/inprogress_challenge_know_more")).click();
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(800, 1960))
			.moveTo(PointOption.point(800, 600))
			.perform();
			
			driver.findElement(By.id("com.ekincare.development:id/challange_stop")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.oneclick.ekincare.ActivityChallengesNew";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test(priority = 60)
	public  void startAndRestartChallenges() {
	
		try {
			
			startChallenges();
			System.out.println("Inside Restart Challeneges Activity");
			
			driver.findElement(By.id("com.ekincare.development:id/radio_question_yes")).click();
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(800, 1960))
			.moveTo(PointOption.point(800, 600))
			.perform();
			
			driver.findElement(By.id("com.ekincare.development:id/challange_restart")).click();
			Thread.sleep(1000);
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.ui.challenge.activity.ActivitySocialChallengeDetailPage";
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