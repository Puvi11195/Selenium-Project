package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniProject_Demo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("poongu11195@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("987654321");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]")).click();
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);");
		
		
	}

}
