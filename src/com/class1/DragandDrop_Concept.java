package com.class1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Concept {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	
	WebElement drag = driver.findElement(By.id("draggable"));
	
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions act =new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();
	
    TakesScreenshot scrfile = (TakesScreenshot) driver;
	File scr = scrfile.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\drop.png");
	FileUtils.copyFile(scr, dest);
	
	}

}
