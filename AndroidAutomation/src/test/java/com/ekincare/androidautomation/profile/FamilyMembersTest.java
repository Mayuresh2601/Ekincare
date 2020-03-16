package com.ekincare.androidautomation.profile;

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
public class FamilyMembersTest extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	@Test(priority = 64)
	public void addFamilyMember() {
		
		System.out.println("Inside Add Family Members Scenario Test");
		try {
			
			login.talkWithDocCredentials();
			
			MobileElement profileBtn = driver.findElement(By.id("com.ekincare.development:id/profile_imageview"));
			profileBtn.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/dashboard_family_layout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/add_family")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[5]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/robotoTextView5")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check")).sendKeys("Shree");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/register_next_view")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check")).click();
			Thread.sleep(1000);
			
			List<MobileElement> date = driver.findElements(By.id("android:id/numberpicker_input"));
			date.get(0).click();
			date.get(0).sendKeys("Jan");
			date.get(0).sendKeys("Jan");
			
			date.get(1).click();
			date.get(1).sendKeys("15");
			date.get(1).sendKeys("15");
			
			date.get(2).click();
			date.get(2).sendKeys("1996");
			date.get(2).sendKeys("1996");
			
			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/register_next_view")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check")).sendKeys("9382019382");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/register_next_view")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.loginregistration.addfamilymember.FamilyMemberAddSuccessActivity";
			assertEquals(actualResult, expectedResult);
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}

	
	@SuppressWarnings("rawtypes")
	@Test(priority = 65)
	public void familyMemberHRA() {
		
		System.out.println("Inside Family Members Complete HRA Scenario Test");
		try {
			
			login.talkWithDocCredentials();
			
			MobileElement profileBtn = driver.findElement(By.id("com.ekincare.development:id/profile_imageview"));
			profileBtn.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/dashboard_family_layout")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/hra_pending_view")).click();
			Thread.sleep(1000);
			
			TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
			action1.press(PointOption.point(650, 480))
			.moveTo(PointOption.point(360, 480))
			.perform();
			
			TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
			action2.press(PointOption.point(650, 766))
			.moveTo(PointOption.point(810, 766))
			.perform();
			
			TouchAction action3 = new TouchAction((PerformsTouchActions) driver);
			action3.press(PointOption.point(650, 1070))
			.moveTo(PointOption.point(710, 1070))
			.perform();
			
			Thread.sleep(500);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/alcohol_three")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/smoking_three")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/excerise_three")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/hypertension_checkboxFather")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/diabetes_checkboxMother")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/none_checkboxYou")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/low_self_esteem_no")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/fatigue_yes")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/body_aches_yes")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/nervous_breakdowns_yes")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/anxiety_yes")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/stress_eating_no")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/carbohydrates_low")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/proteins_moderate")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/fried_high")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/wizard_next_layout")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/skip_bp")).click();
			Thread.sleep(1000);
			
			String actualResult = driver.currentActivity();
			String expectedResult = "com.ekincare.ui.hra.HraFinalActivity";
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