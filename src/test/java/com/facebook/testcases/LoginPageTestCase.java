package com.facebook.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.facebook.pages.LoginPage;
import com.qa.testbase.demo.testbase;

public class LoginPageTestCase extends testbase 
{
	LoginPage loginpage;
	public LoginPageTestCase()
	{
		super();		
	}
	
	@BeforeSuite
	public void setup() 
	{
		initialization();
		loginpage = new LoginPage();
	}	
	@Test
	public void verifytitletest()
	{
		String Title = loginpage.verifytitle();
	}
	
	@Test
	public void verifyloginpage()
	{
		loginpage.verifylogin();
	}
	
//	@Test
//	public void verifyforgot()
//	{
//		loginpage.forgotpass();
//	}	
	
	@AfterSuite
	public void browserclose()
	{
		driver.quit();
	}	
}
