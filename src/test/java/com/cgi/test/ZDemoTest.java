package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * will be deleted
 */
public class ZDemoTest {

	@DataProvider
	public Object[][] demoValidData() {
		
		Object[][] data = new Object[3][2];
		// i --> number of testcase
		// j --> number of arguments

		data[0][0] = "saul";
		data[0][1] = "saul123";

		data[1][0] = "peter";
		data[1][1] = "peter123";

		data[2][0] = "ken";
		data[2][1] = "ken123";

		return data;
	}

	@Test(dataProvider = "demoValidData")
	public void demoValidTest(String username, String password) 
	{
		System.out.println("hello"+username+password);
	}

}
