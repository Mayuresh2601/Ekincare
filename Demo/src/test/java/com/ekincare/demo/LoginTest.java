package com.ekincare.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ekincare.demo.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends Base{
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void startTest() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		loginPage = new LoginPage();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://app.ekincare.com/login");
	}
	
	@SuppressWarnings("static-access")
	@DataProvider
	public Object[][] loginData() {
		
		Object[][] data = utility.getData("loginTestData");
		
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void login(String email, String pwd) throws InterruptedException {

		System.out.println("Inside Login Page");

		home = loginPage.login(email, pwd);

	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
}