package com.cgi.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] invalidLoginTestData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "peter";
		data[0][1] = "peter23";
		data[0][2] = "Invalid credentials";

		data[1][0] = "kim";
		data[1][1] = "kim123";
		data[1][2] = "Invalid credentials";

		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//get @Test name dynamically - because sheetname is the @Test name
		//@test name is sheetname
		String testName=method.getName();
		
		Object[][] data= ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/orange_data.xlsx", testName);
		return data;
	}

	//will 
	
	
}
