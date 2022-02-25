package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])"));
		element.sendKeys("Harry");
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement element2 = driver.findElement(By.xpath("//input[@type='text']"));
		element2.sendKeys("Potter");
		driver.switchTo().defaultContent();
		
		
	}

}
