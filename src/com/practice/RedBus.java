package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("chennai");
		
		driver.findElement(By.id("dest")).sendKeys("Udupi");
		
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		
		
		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();
		
	}

}
