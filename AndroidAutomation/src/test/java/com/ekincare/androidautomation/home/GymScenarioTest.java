package com.ekincare.androidautomation.home;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;
import com.ekincare.androidautomation.LoginTest;
import com.ekincare.androidautomation.utility.CustomListner;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Listeners(CustomListner.class)
public class GymScenarioTest extends BaseTest{
	
	LoginTest login = new LoginTest();

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void beginTest() {

		utility.init_Driver();
	}
	
	
	@SuppressWarnings({ "rawtypes", "static-access" })
	@Test(priority = 0)
	public void gymAndFitness() {
		
		System.out.println("Inside Gym and Fitness Scenario Test");
		try {
			
			login.validUsernameValidPasswordTest();
		
			MobileElement gym  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]"));
			gym.click();
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
			.release()
			.perform();
			Thread.sleep(3000);
			
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