package com.class1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws IOException {
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Snap\\Snap.png");
		FileUtils.copyFile(srcfile, dest);
		
	}

}
