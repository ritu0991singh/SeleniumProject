package com.Testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Utilities.BrowserSettings;
import Utilities.Utility;

public class activity8 extends BrowserSettings {

	Utility utility = new Utility();
	String firstName=getProperty("FirstName")+utility.generateRamdomNumber();
	
	
	@Test
	public void AccTableNameInformation() throws InterruptedException{
		login();
		accounts();
	}
	
	public void login() {
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		loginpage.userName.sendKeys(getProperty("username"));
		loginpage.password.sendKeys(getProperty("password")); 
		loginpage.loginButton.click();
	}

	
	public void accounts() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdown_Sales));
		homepage.drpdown_Sales.click();
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdownValueSales_Accounts));
		homepage.drpdownValueSales_Accounts.click();
		List<WebElement> nameValues= driver.findElements(By.xpath("//td[@class=' inlineEdit']"));
		ArrayList<String> values = new ArrayList<String> ();
		for(WebElement element:nameValues) {
			values.add(element.getText());
		}
		String newLine = System.getProperty("line.separator");
		System.out.println("First five odd rows of Names column are: " +newLine+ values.get(1) +newLine+ values.get(3) +newLine+ values.get(5) +newLine+ values.get(7)+newLine+ values.get(9));
		Reporter.log("First five odd rows of Names column are: " +newLine+ values.get(1) +newLine+ values.get(3) +newLine+ values.get(5) +newLine+ values.get(7)+newLine+ values.get(9));
		
	}
}
