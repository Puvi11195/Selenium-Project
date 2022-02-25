package com.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tnpsc.gov.in/");
		String title = driver.getTitle();
		System.out.println( title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.keralapsc.gov.in/");
		String title2 = driver.getTitle();
		System.out.println(title2 );
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		driver.navigate().to("https://www.karunya.edu/");
		String title3 = driver.getTitle();
		System.out.println(title3);
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		
		driver.navigate().back();
		String title4 = driver.getTitle();
		System.out.println(title4);
		String currentUrl4 = driver.getCurrentUrl();
		System.out.println(currentUrl4);
		
		
	}

}
