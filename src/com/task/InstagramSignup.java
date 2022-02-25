package com.task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSignup {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		driver.close();
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("poongu11195@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("987654320");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\pic\\ins.jpeg");
		FileUtils.copyFile(srcfile, dest);
		
		
	   
		
	}

}
