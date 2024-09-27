package com.cgi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.pages.MainPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	
	private MainPage main;
	private AutomationWrapper wrapper;
	
	public EmployeeSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
		initPage();
	}
	
	public void initPage()
	{
		main=new MainPage(wrapper.driver);
	}
	
	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		wrapper.driver.findElement(By.xpath("//*[text()='PIM']")).click();
	}
	@When("I click on Add Employee menu")
	public void i_click_on_add_employee_menu() {
		wrapper.driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
	}
	@When("I fill the employee detail")
	public void i_fill_the_employee_detail(DataTable dataTable) {
	   
		List<Map<String, String>> lists=dataTable.asMaps();
		
		System.out.println(lists);
		System.out.println(lists.get(0));
		
		System.out.println(lists.get(0).get("firstname"));
		System.out.println(lists.get(0).get("middlename"));
		System.out.println(lists.get(0).get("lastname"));
		
		wrapper.driver.findElement(By.name("firstName")).sendKeys(lists.get(0).get("firstname"));
		
	}
	@When("I click on save")
	public void i_click_on_save() {
	    
	}
	@Then("I should get profile name as {string}")
	public void i_should_get_profile_name_as(String expectedProfileName) {
	   
	}
	@Then("I should get full name in the text field")
	public void i_should_get_full_name_in_the_text_field() {

	}


}
