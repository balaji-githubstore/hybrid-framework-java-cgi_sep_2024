package com.cgi.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {

		String browser = "ch";
		
		WebDriver obj1;
		
		if (browser.equalsIgnoreCase("edge")) 
		{
			 obj1 = new EdgeDriver();
		} 
		else 
		{
			 obj1 = new ChromeDriver();
		}


		obj1.get("https://www.facebook.com/");
		

		obj1.quit();

	}

}
