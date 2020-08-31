package com.Testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;

public class activity3 extends BrowserSettings{
	
	
	@Test
	public void validateFooterText() throws InterruptedException{
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		jse.executeScript("window.scrollBy(0,250)");
		String footerText = loginpage.footerImage.getText();
		Reporter.log("footer text is: " +footerText);
		System.out.println("footer text is: " +footerText);
		
	}
}
