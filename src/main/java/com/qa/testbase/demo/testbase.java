package com.qa.testbase.demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase 
{
	String path;
	public static WebDriver driver;
	public static Properties prop;
	public testbase()
	{
		
		//FileInputStream ip = new FileInputStream("C:\\Users\\install\\workspace\\com.mavenproject\\src\\main\\java\\com\\facebook\\config\\configuration.properties");
		try
		{
			path = System.getProperty("user.dir")+"\\src\\main\\java\\com\\facebook\\config\\configuration.properties";
			//System.out.println(path);
			FileInputStream ip = new FileInputStream(path);
			prop = new Properties();
			prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println((e.getMessage()));
		}
	}
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","D:\\2018\\selenium_software\\new\\chromedriver_win32\\chromedriver.exe");
			System.setProperty(prop.getProperty("systemproperty_1"), prop.getProperty("systemproperty_2"));
			driver = new ChromeDriver();			
//			String urlfb = prop.getProperty("url");
//			driver.get(urlfb);
		}
		driver.manage().window().maximize();
		
		
		String urlfb = prop.getProperty("url");
		System.out.println(urlfb);
		driver.get(urlfb);
	}
	
}
