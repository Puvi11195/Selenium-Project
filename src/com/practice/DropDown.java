package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("fruits"));
		Select myfruit = new Select(element);
		myfruit.selectByVisibleText("Apple");
		myfruit.selectByVisibleText("Banana");
		System.out.println(myfruit.isMultiple());
		
		WebElement country = driver.findElement(By.id("country"));
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry = myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		WebElement heros = driver.findElement(By.id("superheros"));
		Select myHeros = new Select(heros);
		myHeros.selectByIndex(4);
		myHeros.selectByValue("aq");
		System.out.println(myHeros.isMultiple());
		List<WebElement> allHeros = myHeros.getAllSelectedOptions();
		for (WebElement webElement : allHeros) {
			System.out.println(webElement.getText());
		}
		
		List<WebElement> options = myHeros.getOptions();
		for (WebElement web : options) {
			System.out.println(web.getText());
		}
		
		
		
		
	}

}
