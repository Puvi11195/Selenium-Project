package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkindia {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.linkedin.com/login");
		
	Thread.sleep(3000);
		WebElement mail = d.findElement(By.id("username"));
		mail.sendKeys("poongu11195@gmail.com");
		
		WebElement pass= d.findElement(By.id("password"));
		pass.sendKeys("98765432");
		
		Thread.sleep(3000);
		WebElement findElement = d.findElement(By.xpath("//button[@type='submit']"));
		findElement.click();
		
	}

}
