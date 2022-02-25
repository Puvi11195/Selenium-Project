package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  WebElement email = driver.findElement(By.id("email"));
		  email.sendKeys("civilkarthi3@gmail.com");
		  boolean d = email.isDisplayed();
		  System.out.println(d);
		  
		  WebElement pass = driver.findElement(By.name("pass"));
		  pass.sendKeys("9876543210");
		  boolean e = pass.isEnabled();
		  System.out.println(e);
		  
		  WebElement login = driver.findElement(By.name("login"));
		  login.click();
		  
		  
	}

}
