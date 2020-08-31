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

public class activity7 extends BrowserSettings {

	Utility utility = new Utility();
	String firstName=getProperty("FirstName")+utility.generateRamdomNumber();
	
	
	@Test
	public void additionalinformation() throws InterruptedException{
		login();
		createLead();
		viewAdditionalInformation();
	}
	
	public void login() {
		init();
		driver.get(getProperty("URL"));
		wait.until(ExpectedConditions.visibilityOf(loginpage.userName));
		loginpage.userName.sendKeys(getProperty("username"));
		loginpage.password.sendKeys(getProperty("password")); 
		loginpage.loginButton.click();
	}

	
	public void createLead() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdown_Sales));
		homepage.drpdown_Sales.click();
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdownValueSales_Leads));
		homepage.drpdownValueSales_Leads.click();
		wait.until(ExpectedConditions.elementToBeClickable(homepage.createLeads_Sales));
		homepage.createLeads_Sales.click();
		
		//************ Populating overview section********************//
		
		wait.until(ExpectedConditions.elementToBeClickable(homepage.drpdown_salutation));
		homepage.drpdown_salutation.click();
		utility.selectdropdownValueText(homepage.drpdown_salutation, "Miss");
		System.out.println("First Name generated is: "+firstName);
		Reporter.log("First Name generated is: "+firstName);
		homepage.input_firstName.sendKeys(firstName);
		homepage.input_lastName.sendKeys(getProperty("LastName"));
		homepage.input_title.sendKeys(getProperty("title"));
		homepage.input_department.sendKeys(getProperty("department"));
		homepage.input_mobileNum.sendKeys(getProperty("mobileNumber"));
		homepage.input_accName.sendKeys(getProperty("acountName"));
		homepage.input_officephone.sendKeys(getProperty("officePhone"));
		homepage.input_fax.sendKeys(getProperty("fax"));
		homepage.input_website.sendKeys(getProperty("website"));
		homepage.textarea_primaryAddress.sendKeys(getProperty("primaryAddress"));
		homepage.input_primaryCity.sendKeys(getProperty("primaryCity"));	
		homepage.input_primaryState.sendKeys(getProperty("primaryState"));
		homepage.input_primaryPostalCode.sendKeys(getProperty("postalCode"));
		homepage.input_primaryPostalCode.sendKeys(getProperty("country"));
		
		// validating if primary address is copied to secondary address
		homepage.checkbox_copyAddress.click();
		ArrayList<WebElement> altAddress = new ArrayList<WebElement>();
		altAddress.add(homepage.textarea_altAddress);
		altAddress.add(homepage.input_altState);
		altAddress.add(homepage.input_altPostalCode);
		altAddress.add(homepage.input_altCity);
		altAddress.add(homepage.input_altCountry);
		for (WebElement element: altAddress) {
		Assert.assertTrue(element.getAttribute("readonly").equals("true"), "Address not copied successully");
		}
		Reporter.log("Primary Address has been copied successfully to alternative address by clicking on checkbox");
		homepage.input_emailID1.sendKeys(getProperty("EmailId1"));
		homepage.addemailID.click();
		homepage.input_emailID2.sendKeys(getProperty("EmailId2"));
		homepage.radioButton_primary.click();
		homepage.textarea_description.sendKeys(getProperty("description"));
		
		//************ More Information section********************//
		
		utility.selectdropdownValueText(homepage.drpdown_Status, "New");
		homepage.textarea_StatusDescription.sendKeys(getProperty("StatusDesc"));
		homepage.input_oppurtunityAmt.sendKeys(getProperty("oppurtunityAmt"));
		utility.selectdropdownValueText(homepage.drpdown_leadSource, "Email");
		homepage.textarea_leadSourceDescription.sendKeys(getProperty("leadSourceDesc"));
		homepage.input_referredBy.sendKeys(getProperty("referredBy"));
		
		//***************Assigned To*************************//
		homepage.selectUser_assignTo.click();
		utility.switchToChildWindow();
		String user=getProperty("UsernameSelection");
		WebElement element = driver.findElement(By.xpath("//a[text()='"+user+"']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		utility.switchToParentWindow();
		jse.executeScript("arguments[0].scrollIntoView(true);", homepage.btn_save);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.btn_save));
		homepage.btn_save.click();
		Thread.sleep(3000);
		try {
				if(homepage.btn_save.isDisplayed()) {
				homepage.btn_save.click();
				} 
			}catch(Exception e) {
				System.out.println("duplicate record creation popup not displayed");
			
		}
		Thread.sleep(5000);
		
	}
	
	public void viewAdditionalInformation() {
		wait.until(ExpectedConditions.elementToBeClickable(homepage.view_leads));
		homepage.view_leads.click();
		WebElement additionslInfo= driver.findElement(By.xpath("//a[contains(text(),'"+firstName+"')]//following::td[7]"));
		wait.until(ExpectedConditions.elementToBeClickable(additionslInfo));
		additionslInfo.click();
		String phoneNum= homepage.additionalDetails_phoneNum.getText();
		System.out.println("Phone number from additional information is: " +phoneNum);
		Assert.assertTrue(phoneNum.equalsIgnoreCase(getProperty("mobileNumber")), "Mobile Number is not correct and is: " +phoneNum);
		Reporter.log("Phone number from additional information is: " +phoneNum);
	}

}
