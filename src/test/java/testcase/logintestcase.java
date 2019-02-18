package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.driver;

public class logintestcase extends driver
{
	@Test(priority=0)
	public void check_login()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
	@Test(priority=1)
	public void check_forget_link()
	{
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}
}
