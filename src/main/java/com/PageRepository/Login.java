package com.PageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.BrowserSettings;

public class Login extends BrowserSettings {
	WebDriver driver;
	public Login(WebDriver ldriver){
		this.driver= ldriver;
 }   
	
	
	@FindBy(id="user_name") public WebElement userName;
	@FindBy(id="username_password") public WebElement password;
	@FindBy(id="bigbutton") public WebElement loginButton;
	@FindBy(xpath="//img") public WebElement image;
	@FindBy(xpath="//div[@class='p_login_bottom']/a[1]") public WebElement footerImage;
	
	
	

}
