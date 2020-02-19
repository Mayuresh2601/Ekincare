package com.ekincare.webautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	static WebDriver driver;
	
	static {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
    
}