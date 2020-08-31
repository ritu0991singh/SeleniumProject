package com.Testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;

public class activity1 extends BrowserSettings{
	
	
	
	@Test
	public void validateTitle() throws InterruptedException{
		init();
		
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		String title = driver.getTitle();
		Reporter.log("Title is: " +title);
		System.out.println("Titleis: " +title);
		Assert.assertTrue(title.equals(getProperty("title")), "Title is not same as SuiteCRM and is: "+title);
	}
}
