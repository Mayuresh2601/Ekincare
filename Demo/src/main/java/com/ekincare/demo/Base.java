package com.ekincare.demo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

import com.ekincare.demo.pages.HomePage;
import com.ekincare.demo.pages.LoginPage;
import com.ekincare.demo.utility.TestUtility;

public class Base {

	protected static WebDriver driver;
	
	public static Workbook workBook;
	public static Sheet sheet;
	public static FileInputStream file;
	
	public static TestUtility utility;
	
	public static LoginPage loginPage;
	public static HomePage home;
}
