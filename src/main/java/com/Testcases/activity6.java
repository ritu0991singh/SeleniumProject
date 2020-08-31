package com.Testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;

public class activity6 extends BrowserSettings{

	
	
	@Test
	public void validateActivitiesdrpdown() throws InterruptedException{
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		loginpage.userName.sendKeys(getProperty("username"));
		loginpage.password.sendKeys(getProperty("password")); 
		loginpage.loginButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdown_activities));
		System.out.println("Element is visible and can be clicked");
		Reporter.log("Element is visible and can be clicked");
		
	}
}
