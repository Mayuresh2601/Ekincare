package com.ekincare.androidautomation.home;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class OrderMedicinesScenarioTest extends BaseTest {

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	@SuppressWarnings("rawtypes")
//	@Test(priority = 17)
	public void fromGalleryWithoutAddress() {
		
		System.out.println("Inside Order Medicines from gallery images without Address Scenario Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/open_gallery_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("com.ekincare.development:id/input_house_no")).sendKeys("A/20");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.release()
			.perform();
			
			Thread.sleep(4000);
			driver.close();
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
//	@Test(priority = 18)
	public void fromGalleryWithAddress() {
		
		System.out.println("Inside Order Medicines from gallery images with Address Scenario Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/open_gallery_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.release()
			.perform();
			
			Thread.sleep(4000);
			driver.close();
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 4)
	public void pastUploadedWithoutAddressSelf() {
		
		System.out.println("Inside Order Medicines Past Uploaded without specifying Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("com.ekincare.development:id/input_house_no")).sendKeys("A/20");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.OrderAddressBookActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 5)
	public void pastUploadedWithAddressSelf() {
		
		System.out.println("Inside Order Medicines Past Uploaded with specifying Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.PlaceMedicineSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 6)
	public void pastUploadedChangeAddressSelf() {
		
		System.out.println("Inside Order Medicines Past Uploaded with changed Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.id("com.ekincare.development:id/prescription_document_view")).click();
			Thread.sleep(500);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			WebElement house = driver.findElement(By.id("com.ekincare.development:id/input_house_no"));
			house.clear();
			house.sendKeys("C/202");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.PlaceMedicineSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
//	@Test(priority = 7)
	public void pastUploadedDeleteAddressSelf() {
		
		System.out.println("Inside Order Medicines Past Uploaded delete Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			System.out.println(driver.currentActivity());
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.OrderAddressBookActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 8)
	public void pastUploadedWithoutAddressFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded without specifying Address Scenario for Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("com.ekincare.development:id/input_house_no")).sendKeys("A/20");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();

			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.PlaceMedicineSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 9)
	public void pastUploadedWithAddressFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded with specifying Address Scenario for Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.PlaceMedicineSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 10)
	public void pastUploadedChangeAddressFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded with changed Address Scenario for Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/gallery_text")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.id("com.ekincare.development:id/prescription_document_view")).click();
			Thread.sleep(500);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			WebElement house = driver.findElement(By.id("com.ekincare.development:id/input_house_no"));
			house.clear();
			house.sendKeys("C/202");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.perform();
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.PlaceMedicineSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	@Test(priority = 11)
	public void pastUploadedDeleteAddressFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded delete Address Scenario for Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.ImageView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			System.out.println(driver.currentActivity());
			
			actualResult = driver.currentActivity();
			expectedResult = "com.ekincare.health.precipitation.activity.OrderAddressBookActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 14)
	public void pastUploadedWithoutAddressSelfPlusFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded without specifying Address Scenario for Self plus Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("com.ekincare.development:id/input_house_no")).sendKeys("A/20");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.release()
			.perform();
			
			Thread.sleep(4000);
			driver.close();
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "static-access", "rawtypes" })
//	@Test(priority = 15)
	public void pastUploadedWithAddressSelfPlusFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded with specifying Address Scenario for Self Plus Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/mobile_number_field")).sendKeys("1234567890");
			Thread.sleep(1000);
			
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(PointOption.point(91, 2133))
			.moveTo(PointOption.point(1014, 2133))
			.release()
			.perform();
			
		} catch (Exception e) {
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
//	@Test(priority = 16)
	public void pastUploadedDeleteAddressSelfPlusFamily() {
		
		System.out.println("Inside Order Medicines Past Uploaded delete Address Scenario for Self Plus Family Member Test");
		try {
			
			login.validLoginCredentials();
			
			MobileElement orderMedicine  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]"));
			orderMedicine.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/past_prescription_lable")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
			Thread.sleep(1000);
			
			utility.swipeScreen();
			utility.swipeScreen();
			utility.swipeScreen();
			driver.findElement(By.id("com.ekincare.development:id/contimue_label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
//	@Test(priority = 0)
	public void medicineNameWithoutAddressSelf() {
		
		System.out.println("Inside Order Medicines By Name without address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
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
			
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("com.ekincare.development:id/input_house_no")).sendKeys("A/20");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
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
//	@Test(priority = 1)
	public void medicineNameWithAddressSelf() {
		
		System.out.println("Inside Order Medicines By Name with Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
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
//	@Test(priority = 2)
	public void medicineNameChangeAddressSelf() {
		
		System.out.println("Inside Order Medicines By Name with change Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
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
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.id("com.ekincare.development:id/prescription_document_view")).click();
			Thread.sleep(500);
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
			Thread.sleep(2000);
			
			WebElement house = driver.findElement(By.id("com.ekincare.development:id/input_house_no"));
			house.clear();
			house.sendKeys("C/202");
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/home_tag")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/save_address_lable")).click();
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
	
//	@Test(priority = 3)
	public void medicineNameDeleteAddressSelf() {
		
		System.out.println("Inside Order Medicines By Name delete Address Scenario for Self Test");
		try {
			
			login.validLoginCredentials();
			
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
			
			driver.findElement(By.id("com.ekincare.development:id/order_change_address_label")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/saved_address_more")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.health.precipitation.activity.OrderAddressBookActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void endTest() {
		
		utility.quit_Driver();
	}
}