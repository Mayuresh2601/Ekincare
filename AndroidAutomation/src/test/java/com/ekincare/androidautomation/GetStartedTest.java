package com.ekincare.androidautomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.utility.CustomListner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(CustomListner.class)
public class GetStartedTest extends BaseTest {

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}
	
	
	@SuppressWarnings({ "rawtypes" })
	@Test(priority = 0)
	public void getStarted() {
		
		System.out.println("Inside Get Started Scenario Test");
		try {
			
			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/get_started_Button")).click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("testfeb241120@yopmail.com");
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
		
			MobileElement getStarted  = driver.findElement(By.id("com.ekincare.development:id/card_dash_board_image"));
			getStarted.click();
			Thread.sleep(1000);
			
			MobileElement getStartedBtn  = driver.findElement(By.id("com.ekincare.development:id/button_text"));
			getStartedBtn.click();
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