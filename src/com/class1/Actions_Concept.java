package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		 
		WebElement single = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		Actions act = new Actions(driver);
		act.click(single).build().perform();
		
		WebElement right = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		act.click( right).build().perform();
		
		WebElement d = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		act.click(d).build().perform();
		
		
		
		
		
		
		
		
		
	}

}
