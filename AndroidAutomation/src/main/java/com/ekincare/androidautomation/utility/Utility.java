package com.ekincare.androidautomation.utility;

import org.openqa.selenium.Dimension;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Utility extends BaseTest{
	
public static void swipeScreen() {
		
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int start_x = width/2;;
		int end_x = width/2;
		int start_y = (int) (height * 0.80);
		int end_y = (int) (height * 0.20);
		
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(PointOption.point(start_x, start_y))
		.moveTo(PointOption.point(end_x, end_y))
		.release()
		.perform();
	}

}
