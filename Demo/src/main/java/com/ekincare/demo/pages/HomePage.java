package com.ekincare.demo.pages;

import org.openqa.selenium.support.PageFactory;

import com.ekincare.demo.Base;

public class HomePage extends Base{
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

}
