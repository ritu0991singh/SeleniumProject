package com.Testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;

public class activity2 extends BrowserSettings{
	
	
	@Test
	public void validateHeaderImage() throws InterruptedException{
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		String link = loginpage.image.getAttribute("src");
		Reporter.log("Link of Header image is:: " +link);
		System.out.println("Link of Header image is: " +link);
		
	}
}
