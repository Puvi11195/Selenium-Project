package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTask {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
       
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       WebDriverWait wait = new WebDriverWait(driver, 5);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
       
	   
       WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
       search.sendKeys("iPhone");
       search.submit();
      
      
	   
	
	}

}
