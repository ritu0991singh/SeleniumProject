package com.PageRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.BrowserSettings;

public class HomePage extends BrowserSettings {
	WebDriver driver;
	public HomePage(WebDriver ldriver){
		this.driver= ldriver;
	}
	
	
		
		@FindBy(xpath="//ul[@class='nav nav-tabs nav-dashboard']") public WebElement dashboard;
		@FindBy(xpath="//ul[@class='nav navbar-nav']") public WebElement navigationBar;
		@FindBy(xpath="//a[@id='grouptab_0']") public WebElement drpdown_Sales;
		@FindBy(xpath="//a[text()='Activities']") public WebElement drpdown_activities;
		@FindBy(xpath="//a[text()='Leads']") public WebElement drpdownValueSales_Leads;
		@FindBy(xpath="//a[text()='Accounts']") public WebElement drpdownValueSales_Accounts;
		
		
		// WebElements from Create lead form
		
		//*************overview section***************************
		
		@FindBy(xpath="//div[text()='Create Lead']") public WebElement createLeads_Sales;
		@FindBy(xpath="//iframe[@id='ajaxUI-history-iframe']") public WebElement iframe_createLeads;
		@FindBy(xpath="//*[@id='salutation']") public WebElement drpdown_salutation;
		@FindBy(xpath="//input[@id='first_name']") public WebElement input_firstName;
		@FindBy(xpath="//input[@id='last_name']") public WebElement input_lastName;
		@FindBy(xpath="//input[@id='phone_mobile']") public WebElement input_mobileNum;
		@FindBy(xpath="//input[@id='title']") public WebElement input_title;
		@FindBy(xpath="//input[@id='department']") public WebElement input_department;
		@FindBy(xpath="//input[@id='EditView_account_name']") public WebElement input_accName;
		@FindBy(xpath="//input[@id='phone_work']") public WebElement input_officephone;
		@FindBy(xpath="//input[@id='phone_fax']") public WebElement input_fax;
		@FindBy(xpath="//input[@id='website']") public WebElement input_website;
		@FindBy(xpath="//textarea[@id='primary_address_street']") public WebElement textarea_primaryAddress;
		@FindBy(xpath="//input[@id='primary_address_city']") public WebElement input_primaryCity;
		@FindBy(xpath="//input[@id='primary_address_state']") public WebElement input_primaryState;
		@FindBy(xpath="//input[@id='primary_address_postalcode']") public WebElement input_primaryPostalCode;
		@FindBy(xpath="//input[@id='primary_address_country']") public WebElement input_primaryCountry;
		@FindBy(xpath="//input[@id='alt_checkbox']") public WebElement checkbox_copyAddress;
		@FindBy(xpath="//textarea[@id='alt_address_street']") public WebElement textarea_altAddress;
		@FindBy(xpath="//input[@id='alt_address_city']") public WebElement input_altCity;
		@FindBy(xpath="//input[@id='alt_address_state']") public WebElement input_altState;
		@FindBy(xpath="//input[@id='alt_address_postalcode']") public WebElement input_altPostalCode;
		@FindBy(xpath="//input[@id='alt_address_country']") public WebElement input_altCountry;
		@FindBy(xpath="//input[@id='Leads0emailAddress0']") public WebElement input_emailID1;
		@FindBy(xpath="//span[@class='suitepicon suitepicon-action-plus']") public WebElement addemailID;
		@FindBy(xpath="//input[@id='Leads0emailAddress1']") public WebElement input_emailID2;
		@FindBy(xpath="(//input[@id='Leads0emailAddressPrimaryFlag'])[2]") public WebElement radioButton_primary;
		@FindBy(xpath="//textarea[@id='description']") public WebElement textarea_description;
		
		//*************More Information section***************************
		
		@FindBy(xpath="//select[@id='status']") public WebElement drpdown_Status;
		@FindBy(xpath="//textarea[@id='status_description']") public WebElement textarea_StatusDescription;
		@FindBy(xpath="//input[@id='opportunity_amount']") public WebElement input_oppurtunityAmt;
		@FindBy(xpath="(//span[@class='suitepicon suitepicon-action-select'])[1]") public WebElement btn_campaign;
		@FindBy(xpath="//select[@id='lead_source']") public WebElement drpdown_leadSource;
		@FindBy(xpath="//textarea[@id='lead_source_description']") public WebElement textarea_leadSourceDescription;
		@FindBy(xpath="//input[@id='refered_by']") public WebElement input_referredBy;
		
		//*************Other section***************************
		@FindBy(xpath="(//span[@class='suitepicon suitepicon-action-select'])[2]") public WebElement selectUser_assignTo;
		
	
		@FindBy(xpath="(//input[@title='Save'])[2]") public WebElement btn_save;
		@FindBy(xpath="//div[text()='View Leads']") public WebElement view_leads;
		@FindBy(xpath="//span[@class='phone']") public WebElement additionalDetails_phoneNum;
		
		// WebElements from Sales Account page
		
		
		
		
		
 
}
