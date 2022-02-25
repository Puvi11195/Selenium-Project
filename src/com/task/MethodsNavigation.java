package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsNavigation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.annauniv.edu/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://annamalaiuniversity.ac.in/index.php");
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.navigate().back();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().forward();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		
		driver.navigate().back();
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		
		driver.close();
		
		
	}

}
