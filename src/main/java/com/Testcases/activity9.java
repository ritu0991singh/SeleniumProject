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

public class activity9 extends BrowserSettings {

	Utility utility = new Utility();
	String firstName=getProperty("FirstName")+utility.generateRamdomNumber();
	
	
	@Test
	public void NameUserInfoFromLeadTable() throws InterruptedException{
		login();
		leadColumnValues();
	}
	
	public void login() {
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		loginpage.userName.sendKeys(getProperty("username"));
		loginpage.password.sendKeys(getProperty("password")); 
		loginpage.loginButton.click();
	}

	
	public void leadColumnValues() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdown_Sales));
		homepage.drpdown_Sales.click();
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdownValueSales_Leads));
		homepage.drpdownValueSales_Leads.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class=' inlineEdit']")));
		List<WebElement> nameValues= driver.findElements(By.xpath("//td[@class=' inlineEdit']"));
		ArrayList<String> Namevalues = new ArrayList<String> ();
		for(WebElement element:nameValues) {
			Namevalues.add(element.getText());
		}
		List<WebElement> userValues= driver.findElements(By.xpath("//td[@class='hidden-xs hidden-sm inlineEdit']"));
		ArrayList<String> Uservalues = new ArrayList<String> ();
		for(WebElement element:userValues) {
			Uservalues.add(element.getText());
		}
		for(int i=0; i<10; i++) {
			System.out.println("Name in row "+i+" is: " +Namevalues.get(i));	
			Reporter.log("Name in row "+i+" is: " +Namevalues.get(i));
		}
		for(int i=0; i<10; i++) {
			System.out.println("User in row "+i+" is: " +Uservalues.get(i));
			Reporter.log("User in row "+i+" is: " +Uservalues.get(i));
		}
	}
	
	

}
