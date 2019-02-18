package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driver 
{
	String path;
	public static WebDriver driver;
	@BeforeSuite
	public void launch_browser()
	{
		path = System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterSuite
	public void close_browser()
	{
		driver.close();
	}
}
