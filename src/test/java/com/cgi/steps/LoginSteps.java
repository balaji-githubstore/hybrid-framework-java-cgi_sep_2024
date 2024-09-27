package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private AutomationWrapper wrapper;
	
	public LoginSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
	}
	
	@Given("I have browser with orangehrm application")
	public void i_have_browser_with_orangehrm_application() {
		wrapper.driver = new ChromeDriver();
		wrapper.driver.manage().window().maximize();
		wrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		wrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		wrapper.driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		wrapper.driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		wrapper.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("I should access to the dashboard page with header as {string}")
	public void i_should_access_to_the_dashboard_page_with_header_as(String expectedHeader) {
		
		String actualHeader=wrapper.driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
		Assert.assertEquals(actualHeader, expectedHeader);
	}

	@Then("I should not get access to dashboard with error as {string}")
	public void i_should_not_get_access_to_dashboard_with_error_as(String expectedError) {
		String actualError=wrapper.driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertTrue(actualError.contains(expectedError)); //expect true 
		
	}
}
