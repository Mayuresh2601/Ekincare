package com.ekincare.androidautomation.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;import org.apache.catalina.User;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ekincare.androidautomation.BaseTest;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class Utility extends BaseTest{
	
	static String ScreenshotFolder = "/FailedScreenshots/";
	static String screenshotPath = System.getProperty("user.dir") +ScreenshotFolder+ "";
	static String result = null;
	
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
		.release()
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
	
	
	public static String readImage() throws TesseractException {

		
		try {
			
			System.out.println("Taking Screenshot");
			Thread.sleep(500);
			String imgPath = getScreenShots();
			
			File imageFile = new File(imgPath);
			System.out.println("Image name is :" + imageFile.toString());
			ITesseract instance = new Tesseract();

			File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // Extracts

			instance.setDatapath(tessDataFolder.getAbsolutePath()); // sets tessData
			result = instance.doOCR(imageFile);
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("Cause is: "+e.getCause());
			System.out.println("Message is: "+e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}

}
