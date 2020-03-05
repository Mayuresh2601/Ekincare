package com.ekincare.androidautomation.health;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.MobileElement;

public class Insights extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	@Test(priority = 47)
	public void userWellnessReport() {
		
		System.out.println("Inside Family Doctor Chat Dashboard");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement health = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"PROFILE\"]"));
			health.click();
			Thread.sleep(1000);
			
			MobileElement insights = driver.findElement(By.id("com.ekincare.development:id/my_insight_tab"));
			insights.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/arrow_icon")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.familydoctorflow.views.FamilyDoctorChatActivity";
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