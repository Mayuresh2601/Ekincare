package com.ekincare.androidautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ekincare.androidautomation.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(id = "com.ekincare.development:id/skipButton")
	WebElement skip;
	
	@FindBy(id = "com.ekincare.development:id/get_started_Button")
	WebElement getStarted;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout")
	WebElement corporateEmp;
	
	@FindBy(id = "com.ekincare.development:id/edit_text_email_check")
	WebElement email;
	
	@FindBy(id = "com.ekincare.development:id/register_next_view")
	WebElement nextBtn;
	
	@FindBy(id = "com.ekincare.development:id/password_set")
	WebElement password;
	
	@FindBy(id = "com.ekincare.development:id/otp_next_view")
	WebElement nextBTN;
	
	@FindBy(id = "com.ekincare.development:id/tv_dismiss")
	WebElement dismiss;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void validLoginCredentials() {
		
		try {

			skip.click();
			Thread.sleep(1000);
			getStarted.click();
			corporateEmp.click();
			Thread.sleep(1000);
			email.sendKeys("ashwini@ekincare.com");
			Thread.sleep(1000);
			nextBtn.click();
			Thread.sleep(1000);
			
			password.sendKeys("ekincare123");
			Thread.sleep(1000);
			nextBTN.click();
			Thread.sleep(1000);
			dismiss.click();
			
		} catch (Exception e) {
			System.out.println("Cause  is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
}