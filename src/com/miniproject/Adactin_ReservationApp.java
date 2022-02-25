package com.miniproject;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_ReservationApp {

	public static void main(String[] args) throws  Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");	
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("PoongundranM");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("98CXJ2");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select hotelLocation= new Select(location);
		hotelLocation.selectByValue("London");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotelType= new Select(hotel);
		hotelType.selectByIndex(1);
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select  roomType= new Select(room);
		roomType.selectByValue("Deluxe");
		
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select roomNumber = new Select(roomNos);
		roomNumber.selectByIndex(1);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.sendKeys("15/02/2022");
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.sendKeys("17/02/2022");
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
	    Select adultRoomSelection = new Select(adultRoom);
	    adultRoomSelection.selectByIndex(1);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement buttonClick = driver.findElement(By.id("radiobutton_0"));
		buttonClick.click();
		
		WebElement continueClick = driver.findElement(By.name("continue"));
		continueClick.click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Poongundran");
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Murugesan");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("ABC");
		
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("9876543219876543");
		
		WebElement Type = driver.findElement(By.id("cc_type"));
		Select ccType=new Select(Type);
		ccType.selectByIndex(2);
		
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select expMonth=new Select(exp);
		expMonth.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select expYear =new Select(year);
		expYear.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("768");
		
		WebElement finalSubmit = driver.findElement(By.id("book_now"));
		finalSubmit.click();
		
		
		WebElement myOrders = driver.findElement(By.name("my_itinerary"));
		myOrders.click();
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		File scrfile = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenShot\\Adactin.png");
		FileUtils.copyFile(scrfile, dest);
		
	}

}
