package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.demo.testbase;

public class LoginPage extends testbase
{
	@FindBy(id="email")
	WebElement useremail;
	
	@FindBy(id="pass")
	WebElement userpass;
	
	@FindBy(id="loginbutton")
	WebElement loginbutton;
	
//	@FindBy(partialLinkText="account?")
//	WebElement forgot;
	
	public LoginPage() 
	{
		PageFactory.initElements(driver,this);	
	}	
	
	public String verifytitle()
	{
		return driver.getTitle();		
	}
	
	public void verifylogin()
	{
		useremail.sendKeys(prop.getProperty("username"));
		userpass.sendKeys(prop.getProperty("password"));
		loginbutton.click();
		driver.navigate().back();
	}
	
//	public void forgotpass()
//	{
//		forgot.click();
//		driver.navigate().back();
//	}
}
