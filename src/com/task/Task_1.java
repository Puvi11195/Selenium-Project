package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_1 {
	 public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\Driver1\\chromedriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://practice.automationtesting.in/");

}
}