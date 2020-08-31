package com.Testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;

public class activity4 extends BrowserSettings{

	
	
	@Test
	public void validateHomepageIsLoaded() throws InterruptedException{
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		loginpage.userName.sendKeys(getProperty("username"));
		loginpage.password.sendKeys(getProperty("password")); 
		loginpage.loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(homepage.dashboard));
		Assert.assertTrue(homepage.dashboard.isDisplayed(), "homepage is not loaded ");
		Reporter.log("Homepage Dashboard is loaded");
	}
}
