package com.class1;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement f = driver.findElement(By.xpath("//select[@name='coffee']"));
		Select s = new Select( f);
		System.out.println(s.isMultiple());
		s.selectByValue("black");
		s.selectByValue("regular");
		s.selectByValue("crisp");
		List<WebElement> options = s.getOptions();
		for (WebElement web : options) {
			String text = web.getText();
			System.out.println( text);
		}
		WebElement element = driver.findElement(By.xpath("//select[@name='coffee2']"));
		Select s1 = new Select(element);
		System.out.println(s1.isMultiple());
		s1.selectByValue("skim");
		s1.selectByValue("whipped");
		s1.deselectByIndex(7);
		List<WebElement> SelectedOptions = s1.getAllSelectedOptions();
		for (WebElement webElement : SelectedOptions) {
			System.out.println(webElement.getText());
			
		}
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		s1.deselectByValue("whipped");
		s1.deselectByValue("skim");
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		File scrfile = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\DD.png");
		FileUtils.copyFile(scrfile, dest);
		

	
	
		
		
	    
	   
	   
	   
	   
		
		
		
		
		
		
		
		
		   
		
		
	
	
	
	
	
	
	
	
	
	}
	   
		
		
		
		
		
			
		}
		
		
	


