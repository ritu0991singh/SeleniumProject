package com.Testcases;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;

public class activity5 extends BrowserSettings{
	
	
	@Test
	public void validateColorNavBar() throws InterruptedException{
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		loginpage.userName.sendKeys(getProperty("username"));
		loginpage.password.sendKeys(getProperty("password")); 
		loginpage.loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(homepage.navigationBar));
		Thread.sleep(4000);
		String buttonTextColor = homepage.navigationBar.getCssValue("color");
	    String buttonTextColorHex = Color.fromString(buttonTextColor).asHex();
	    System.out.println("color of Navigation menu is: " +buttonTextColorHex);
	    String expectedTextColor="#534d64";
	    Assert.assertTrue(buttonTextColorHex.equalsIgnoreCase(expectedTextColor), "The color is not as expected");
	    Reporter.log("color is: " +buttonTextColorHex);
		
	}
}
