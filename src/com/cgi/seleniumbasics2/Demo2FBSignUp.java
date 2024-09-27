package com.cgi.seleniumbasics2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo2FBSignUp {
	
	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//findelement- check for presence of element in 0.5s 
		driver.findElement(By.linkText("Create new account")).click();
		
		//findelement- check for presence of element in 0.5s 
		driver.findElement(By.name("firstname")).sendKeys("jack");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//17-june-1992
		
		//17
		Select selectDay=new Select(driver.findElement(By.xpath("//select[@title='Day']")));
		selectDay.selectByVisibleText("17");
		
		//jun
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Jun");
		
//		selectMonth.selectByValue("6");
//		selectMonth.selectByIndex(5);
		
		//select year 1992
		
		
	}

}
