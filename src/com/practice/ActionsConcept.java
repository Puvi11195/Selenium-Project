package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class ActionsConcept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(findElement).build().perform();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);

		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		act.contextClick(findElement2).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String g : windowHandles) {
			String title = driver.switchTo().window(g).getTitle();
			System.out.println(title);
		}
		String s = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(s)) {
				System.out.println("Process done");
				break; 
			}
		}



	}

}
