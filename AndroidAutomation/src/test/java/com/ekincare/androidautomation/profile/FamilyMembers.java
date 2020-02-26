package com.ekincare.androidautomation.profile;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class FamilyMembers extends BaseTest{
	
	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {
		
		utility.init_Driver();
	}
	
	@Test(priority = 0)
	public void addFamilyMember() {
		
		System.out.println("Inside Family Members Scenario Test");
		try {
			
			Thread.sleep(2000);
			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			MobileElement getStarted = driver.findElement(By.id("com.ekincare.development:id/get_started_Button"));
			getStarted.click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("ashwini@ekincare.com");
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
//			MobileElement dismiss = driver.findElement(By.id("com.ekincare.development:id/tv_dismiss"));
//			dismiss.click();
//			Thread.sleep(1000);
			
			MobileElement profileBtn = driver.findElement(By.id("com.ekincare.development:id/profile_imageview"));
			profileBtn.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/dashboard_family_layout")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/add_family")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/robotoTextView5")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check")).sendKeys("Avinash");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/register_next_view")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")).clear();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")).sendKeys("1997");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")).clear();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")).sendKeys("04");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")).clear();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")).sendKeys("Dec");
			Thread.sleep(2000);
			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/register_next_view")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check")).sendKeys("9845694698");
			Thread.sleep(1000);
			driver.findElement(By.id("com.ekincare.development:id/register_next_view")).click();
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}

	
	@SuppressWarnings("rawtypes")
//	@Test(priority = 1)
	public void familyMemberHRA() {
		
		System.out.println("Inside Family Members Complete HRA Scenario Test");
		try {
			
			Thread.sleep(2000);
			MobileElement skip = driver.findElement(By.id("com.ekincare.development:id/skipButton"));
			skip.click();
			Thread.sleep(1000);
			MobileElement getStarted = driver.findElement(By.id("com.ekincare.development:id/get_started_Button"));
			getStarted.click();
			MobileElement corporateEmp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
			corporateEmp.click();
			Thread.sleep(1000);
			MobileElement email = driver.findElement(By.id("com.ekincare.development:id/edit_text_email_check"));
			email.sendKeys("ashwini@ekincare.com");
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
			MobileElement dismiss = driver.findElement(By.id("com.ekincare.development:id/tv_dismiss"));
			dismiss.click();
			Thread.sleep(1000);
			
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
			.release()
			.perform();
			
			TouchAction action2 = new TouchAction((PerformsTouchActions) driver);
			action2.press(PointOption.point(650, 766))
			.moveTo(PointOption.point(810, 766))
			.release()
			.perform();
			
			TouchAction action3 = new TouchAction((PerformsTouchActions) driver);
			action3.press(PointOption.point(650, 1070))
			.moveTo(PointOption.point(710, 1070))
			.release()
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
			driver.findElement(By.id("com.ekincare.development:id/score_close")).click();
			Thread.sleep(1000);
			
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