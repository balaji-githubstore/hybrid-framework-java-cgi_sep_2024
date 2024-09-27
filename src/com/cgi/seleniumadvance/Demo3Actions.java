package com.cgi.seleniumadvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Actions {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://futureskillsprime.in/");
		
		Actions actions=new Actions(driver);
		
		//actions.moveToElement(driver.findElement(By.xpath("//span[text()='Explore']"))).perform();
		driver.findElement(By.xpath("//span[text()='Explore']")).click();

		actions.moveToElement(driver.findElement(By.xpath("//a[text()='FutureSkills Prime']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Get nasscom certified']")).click();
	}

}
