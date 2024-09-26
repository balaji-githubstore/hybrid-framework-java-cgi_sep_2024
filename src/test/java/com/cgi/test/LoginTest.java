package com.cgi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;
import com.cgi.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider", groups = { "login", "smoke" })
	public void validLoginTest(String username, String password, String expectedValue) {

		LoginPage login = new LoginPage(driver);
		login.EnterUsername(username);
		login.EnterPassword(password);
		login.clickOnLogin();

		// Assert the text - Quick Launch
		DashboardPage dashboard = new DashboardPage(driver);
		String actualText = dashboard.getQuickLaunchText();

		Assert.assertEquals(actualText, expectedValue);
	}

	@Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider", groups = { "login" })
	public void invalidLoginTest(String username, String password, String expectedError) {

		LoginPage login = new LoginPage(driver);
		login.EnterUsername(username);
		login.EnterPassword(password);
		login.clickOnLogin();

		// Assert the error shown - Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
