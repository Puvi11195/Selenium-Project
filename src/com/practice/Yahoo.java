package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=us");
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("poongu11195@yahoo.com");
		
		WebElement signin = driver.findElement(By.name("signin"));
		signin.click();
		
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("6789657");
		
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("login-signin"));
		submit.click();
		
	}

}
