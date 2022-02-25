package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    
    WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
    searchBar.sendKeys("Iphone");
    
    WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
	submit.click();
	
	driver.findElement(By.xpath("(//span[contains(text(),'iPhone ')])[4]")).click();
	

	
	
		
		
		
	}

}
