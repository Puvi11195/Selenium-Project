package com.miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");	
	
	driver.findElement(By.xpath("//a[@class='login']")).click();
	
	WebElement mail = driver.findElement(By.name("email_create"));
	mail.sendKeys("poongu11195@hotmail.com");
	
	driver.findElement(By.name("SubmitCreate")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.name("id_gender")).click();
	
	WebElement firstName = driver.findElement(By.name("customer_firstname"));
	firstName.sendKeys("John");
	
	WebElement lastName = driver.findElement(By.name("customer_lastname"));
	lastName.sendKeys("Micheal");
	
	WebElement pass = driver.findElement(By.id("passwd"));
	pass.sendKeys("987654321");
	
	WebElement Day = driver.findElement(By.id("days"));
	Select s = new Select(Day);
	s.selectByValue("11");
	
	WebElement month = driver.findElement(By.id("months"));
	Select s1 =new Select( month);
	s1.selectByIndex(1);
	
	WebElement year = driver.findElement(By.id("years"));
    year.sendKeys("1995");
    
    WebElement company = driver.findElement(By.id("company"));
    company.sendKeys("Breau Veritas");
    
    WebElement address1 = driver.findElement(By.name("address1"));
    address1.sendKeys("Industrial Estate");
    
    WebElement address2 = driver.findElement(By.name("address2"));
    address2.sendKeys("Western Street");
    
    WebElement city = driver.findElement(By.name("city"));
    city.sendKeys("MilesSqare");
    
    WebElement state = driver.findElement(By.name("id_state"));
    Select s2 = new Select(state);
    s2.selectByValue("53");
    
    WebElement postcode = driver.findElement(By.name("postcode"));
    postcode.sendKeys("20001");
    
    WebElement country = driver.findElement(By.id("id_country"));
    Select s3 = new Select(country);
    s3.selectByValue("21");
    
    WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
    phone_mobile.sendKeys("9876543210");
    
    WebElement reference = driver.findElement(By.id("alias"));
    reference.sendKeys(" New Jercy-30004");
    
    WebElement submitAccount = driver.findElement(By.id("submitAccount"));
    submitAccount.click();
    
    
    
    
	}

}
