package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;



public class ActionsConcept {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Up to 65% off | Refurbished laptops']"));
		act.moveToElement(findElement).build().perform();
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='See more']"));
		act.contextClick(findElement2).build().perform();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
        
		
		
		
	}

}
