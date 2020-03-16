package com.ekincare.androidautomation.utility;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Utility extends BaseTest {
	
	
	@SuppressWarnings("rawtypes")
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
		.perform();
	}
	
	
	@SuppressWarnings("rawtypes")
	public static void swipeYear() {
		
		TouchAction action1 = new TouchAction((PerformsTouchActions) driver);
		action1.press(PointOption.point(565, 760))
		.moveTo(PointOption.point(565, 1600))
		.perform();
	}

	
	public static String getScreenShots() {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(" DD/MM/yyyy hh:mm:ss");
		String actualDate = formatter.format(date);

		TakesScreenshot screenshot1 = (TakesScreenshot) driver;

		// To get the Source File and store it in file.io
		File srcFile1 = screenshot1.getScreenshotAs(OutputType.FILE);

		// To store the screenshot in the destination file
		String destination = System.getProperty("user.dir") + "/FailedScreenshots/" + actualDate + ".png";
		File destFile = new File(destination);

		try {
			FileUtils.copyFile(srcFile1, destFile);
			Thread.sleep(2000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return destination;
	}
	
	public static File readImage(String screenShot) throws Exception {
 
        File screen = new File(screenShot);
 
        // create an instance of buffered image from captured screenshot
        BufferedImage img = ImageIO.read(screen);
 
        // get the width and height of the WebElement using getSize()
        Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
        // create a rectangle using width and height
        Rectangle rect = new Rectangle(width, height);
 
        // create image  for element using its location and size.
        BufferedImage dest = img.getSubimage(0, 0, rect.width, rect.height);
 
        // write back the image data for element in File object
        ImageIO.write(dest, "png", screen);
 
        // return the File object containing image data
        return screen;
    }

	public static void init_Driver() {
		
		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");

			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 6T");
			caps.setCapability(MobileCapabilityType.UDID, "6d2a00fc");

			caps.setCapability("appPackage", "com.ekincare.development");
			caps.setCapability("appActivity", "com.ekincare.SplashScreenActivity");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AndroidDriver<MobileElement>(url, caps);
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.out.println("Cause is: " + e.getCause());
			System.out.println("Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void quit_Driver() {
		
		try {
			
			Thread.sleep(4000);
			driver.quit();
			
		} catch (Exception e) {
			
			System.out.println("Causen is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
	}
}