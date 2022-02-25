package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	       
	       
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       
	       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	       WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		   mobile.click();
		
		
	}

}
