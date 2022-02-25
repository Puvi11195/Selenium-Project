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

public class AlertConcept {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();	
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.get("https://demoqa.com/alerts");
	  
	  WebElement simple = driver.findElement(By.xpath("//button[@id='alertButton']"));
	  simple.click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.switchTo().alert().accept();
	  
	  WebElement f = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	  f.click();
	  
	  
	  WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	  confirm.click();
	  driver.switchTo().alert().dismiss();
	  
	  WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
	  prompt.click();
	  driver.switchTo().alert().sendKeys("Horry potter");
	  driver.switchTo().alert().accept();
	  
//	  TakesScreenshot scr = (TakesScreenshot) driver;
//	  File scrfile = scr.getScreenshotAs(OutputType.FILE);
//	  File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\alert.png");
//	  FileUtils.copyFile(scrfile, dest);
//	  
//	  
		
	}
	

}
