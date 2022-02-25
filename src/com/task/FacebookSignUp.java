package com.task;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {
	
	  public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(6000);
		 WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 first.sendKeys("kevin");
		 
         WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		 last.sendKeys("kurup");
		 
		 WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		 mobile.sendKeys("9876567485");
		 
		 WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		 pass.sendKeys("1234567");
		 
		 Thread.sleep(3000);
		 WebElement day = driver.findElement(By.id("day"));
		 day.sendKeys("11");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 month.sendKeys("jan");
		 
		 WebElement year = driver.findElement(By.id("year"));
		 year.sendKeys("1995");
		 
		 Thread.sleep(3000);
		 WebElement s = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		 s.click();
		 
		 WebElement click = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		 click.click();
		 
		 TakesScreenshot scr = (TakesScreenshot) driver;
		 File screenshotAs = scr.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\snap.png");
		 FileUtils.copyFile(screenshotAs, dest);
		 
		 
		 
		
		
		
		
	}

}
