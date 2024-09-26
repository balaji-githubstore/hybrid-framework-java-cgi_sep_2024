package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// Assert the text - Quick Launch
		String actualText = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
		Assert.assertEquals(actualText, "Quick Launch");
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider")
	public void invalidLoginTest(String username, String password, String expectedError) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// Assert the error shown - Invalid credentials
		String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertEquals(actualError, expectedError);
	}
}
