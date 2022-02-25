package com.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement table = driver.findElement(By.xpath("(//div[@class=\" container table\"])[1]"));
		List<WebElement> header = table.findElements(By.tagName("th"));
		for (WebElement web : header) {
			String text = web.getText();
			System.out.println(text);
		}
		List<WebElement> rows  = table.findElements(By.tagName("tr"));
        int size = rows.size();	
        System.out.println(size);
        
        List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td"));
       for (WebElement web : elements) {
    	   System.out.println(web.getText());
		
   
	}
    
    	   
	}
        
        
		}
	



