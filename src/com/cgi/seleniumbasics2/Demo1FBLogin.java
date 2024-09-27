package com.cgi.seleniumbasics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1FBLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
//		By locator=By.id("email");		
//		WebElement element= driver.findElement(locator);
//		element.sendKeys("hello");
				
		WebElement element= driver.findElement(By.id("email"));
		element.sendKeys("hello");
		
		//driver.findElement(By.id("email")).sendKeys("helllo123444444@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		//click on login
		driver.findElement(By.name("login")).click();
		
		
	}
}
