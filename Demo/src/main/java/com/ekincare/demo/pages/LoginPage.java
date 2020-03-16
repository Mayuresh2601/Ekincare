package com.ekincare.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ekincare.demo.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailId;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[text()='Get Started']")
	WebElement getStarted;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String email, String pwd) throws InterruptedException {
		
		emailId.sendKeys(email);
		Thread.sleep(1000);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		checkbox.click();
		getStarted.click();
		return new HomePage();
	}
}