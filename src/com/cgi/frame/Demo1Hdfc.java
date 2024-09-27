package com.cgi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Hdfc {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
		
		//click on continue
		//linkText works based on the UI font 
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
