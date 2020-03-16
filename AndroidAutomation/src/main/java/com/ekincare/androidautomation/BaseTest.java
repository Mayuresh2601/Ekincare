package com.ekincare.androidautomation;

import com.ekincare.androidautomation.pages.LoginPage;
import com.ekincare.androidautomation.utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	protected static AndroidDriver<MobileElement> driver;
	
	protected static Utility utility;
	
	protected static LoginPage login = new LoginPage();
	
	protected static String actualResult;
	protected static String expectedResult;
	
	protected static ExtentReports reports;
    
}