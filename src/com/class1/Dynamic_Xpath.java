package com.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		for (WebElement price : elements) {
			System.out.println(price.getText());
			
		}
	}

}
