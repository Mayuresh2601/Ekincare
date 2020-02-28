package com.ekincare.androidautomation.health;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.MobileElement;

public class MedicalReports extends BaseTest{
	
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	@Test(priority = 0)
	public void viewMedicalReport() {
		
		System.out.println("Inside Medical Report to Upload and view Report");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement health = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"PROFILE\"]"));
			health.click();
			Thread.sleep(1000);
			
			MobileElement medicalReports = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[1]"));
			medicalReports.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/header_add_icon")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			
			driver.findElementByAccessibilityId("Documents").click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/document_layout")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.oneclick.ekincare.DocumentViewActivity";
			assertEquals(actualResult, expectedResult);

		} catch (Exception e) {

			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 1)
	public void deleteMedicalReport() {
		
		System.out.println("Inside Medical Report to Upload and Delete Report");
		try {
			
			login.talkWithFamilyCredentials();
			
			MobileElement health = driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"PROFILE\"]"));
			health.click();
			Thread.sleep(1000);
			
			MobileElement medicalReports = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.LinearLayout[1]"));
			medicalReports.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/header_add_icon")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.health.medicalRecord.MedicalRecordActivity";
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