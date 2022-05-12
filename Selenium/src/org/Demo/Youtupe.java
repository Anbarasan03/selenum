package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtupe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		JavascriptExecutor u=(JavascriptExecutor)driver;
		WebElement you = driver.findElement(By.id("endpoint"));
		Thread.sleep(2000);
	    u.executeScript("arguments[0].scrollIntoView()",you);
	    u.executeScript("window.scrollBy(0,-1500)");
	    
		
	}

	
	}


