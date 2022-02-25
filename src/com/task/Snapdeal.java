package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		search.sendKeys("HP laptop");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
	}

}
