package com.miniproject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miniproject_Login {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@class='login']"));
		element.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("poongu11195@hotmail.com");
		
		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("987654321");
		
		WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
		submitLogin.click();
		
		WebElement findElement = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		findElement.click();
		
		WebElement Tshirt = driver.findElement(By.xpath("//img[contains(@alt,'Short Sleeve ')]"));
		Tshirt.click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement findElement1 = driver.findElement(By.id("Submit"));
		findElement1.click();
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement findElement2 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		findElement2.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		findElement3.click();
		
		WebElement findElement4 = driver.findElement(By.name("processAddress"));
		findElement4.click();
		
		WebElement findElement5 = driver.findElement(By.id("cgv"));
		findElement5.click();
		
		WebElement findElement6 = driver.findElement(By.name("processCarrier"));
		findElement6.click();
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		
		WebElement backPage = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		backPage.click();
		
		
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 200);");
	    
	    TakesScreenshot scrfle= (TakesScreenshot) driver;
		File scr = scrfle.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Pic\\MP.png");
	    FileUtils.copyFile(scr, dest);
	    
		
		
	}

}
