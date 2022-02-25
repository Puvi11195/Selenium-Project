package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTask {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		   
		  WebDriver d = new ChromeDriver();
//		  d.manage().window().maximize();
		  d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		  
         WebElement username = d.findElement(By.id("ap_email"));
         username.sendKeys("poongu11195@gmail.com");
         boolean enabled = username.isEnabled();
         System.out.println(enabled);
         boolean displayed = username.isDisplayed();
         System.out.println(displayed);
         boolean selected = username.isSelected();
         System.out.println(selected);
         
         
         WebElement pass = d.findElement(By.id("continue"));
         pass.click();
         
         WebElement login = d.findElement(By.name("password"));
         login.sendKeys("980786");
         
         WebElement signin = d.findElement(By.id("signInSubmit"));
         signin.click();
         
         
         
         
         
		
		 
		  
		  
		
		  
	}

}
