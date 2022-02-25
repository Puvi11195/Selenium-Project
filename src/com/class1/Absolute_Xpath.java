package com.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com");
		
		
		driver.findElement(By.xpath("(//a[@href='java-tutorial'])[1]")).click();
		
		List<WebElement> content = driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h2"));
		for (WebElement string : content) {
			String text = string.getText();
			System.out.println(text);
			
		}
	}

}
