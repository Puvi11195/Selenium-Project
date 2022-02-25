package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mail.sendKeys("poongu11195@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("9876543210");
		
		WebElement c = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		c.click();
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		File scrfile = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\flip.png");
		FileUtils.copyFile(scrfile, dest);
		
	}

}
