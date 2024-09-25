package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Assert the text - Quick Launch
	    String actualText = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
		Assert.assertEquals(actualText, "Quick Launch");
	}
	
	@Test
	public void invalidLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("bala");
		driver.findElement(By.name("password")).sendKeys("bala123");
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	    //Assert the error shown - Invalid credentials
	}
}
