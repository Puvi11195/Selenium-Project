package com.class1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(1);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//input[@name='fname']"));
		element.sendKeys("Poongundran M");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		WebElement element1 = driver.findElement(By.xpath("//input[@name='lname']"));
		element1.sendKeys("Murugesan");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(1);
		WebElement element2 = driver.findElement(By.xpath("//input[@name='email']"));
		element2.sendKeys("poongu11195@hotmail.com");
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		  File scrfile = scr.getScreenshotAs(OutputType.FILE);
		  File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\Frames.png");
		  FileUtils.copyFile(scrfile, dest);
		
		
	}

}
