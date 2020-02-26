package com.ekincare.androidautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage extends BaseTest{
	
	//Page Repository
	@AndroidFindBy(id = "com.ekincare.development:id/skipButton")
	MobileElement skip;
	
	@FindBy(id = "com.ekincare.development:id/get_started_Button")
	MobileElement getStarted;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout")
	MobileElement corporateEmp;
	
	@FindBy(id = "com.ekincare.development:id/edit_text_email_check")
	MobileElement email;
	
	@FindBy(id = "com.ekincare.development:id/register_next_view")
	MobileElement nextBtn;
	
	@FindBy(id = "com.ekincare.development:id/password_set")
	MobileElement password;
	
	@FindBy(id = "com.ekincare.development:id/otp_next_view")
	MobileElement nextBTN;
	
	@FindBy(id = "com.ekincare.development:id/tv_dismiss")
	MobileElement dismiss;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]")
	MobileElement gym;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
	MobileElement healthCheckup;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@SuppressWarnings({ "static-access", "rawtypes" })
	public void gymAndFitness() {

		System.out.println("Inside Gym and Fitness Scenario Test");
		skip.click();
		getStarted.click();
		corporateEmp.click();
		email.sendKeys("ashwini@ekincare.com");
		nextBtn.click();
		password.sendKeys("ekincare123");
		nextBTN.click();
		dismiss.click();
		gym.click();

		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout"))
				.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.TextView"))
				.click();
		driver.findElement(By.id("com.ekincare.development:id/gym_row_view")).click();

		utility.swipeScreen();

		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(PointOption.point(91, 2133)).moveTo(PointOption.point(1014, 2133)).release().perform();

	}
}