package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	private By quickLaunchLocator = By.xpath("//p[contains(normalize-space(),'Quick')]");
	private By dashboardLocator=By.xpath("//h6[contains(normalize-space(),'Dash')]");

	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getQuickLaunchText() {
		return driver.findElement(quickLaunchLocator).getText();
	}
	
	public String getDashboardText() {
		return driver.findElement(dashboardLocator).getText();
	}
}
