package com.cgi.seleniumadvance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	public static void main(String[] args) {
		
		//file class to get the absolute path keeping the pdf inside project

		File file=new File("file/profile.pdf");
		String absPath=file.getAbsolutePath();
		System.out.println(absPath);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absPath);
	}

}
