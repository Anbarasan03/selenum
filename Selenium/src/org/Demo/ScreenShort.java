package org.Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				WebElement user = driver.findElement(By.id("email"));
				user.sendKeys("asdfg@gmail.com");
				WebElement pwd = driver.findElement(By.name("pass"));
				pwd.sendKeys("123456");
				WebElement login = driver.findElement(By.name("login"));
				login.click();
	
	Thread.sleep(1000);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Screenshrt\\pic1.PNG");
    FileHandler.copy(source, destination);
	

	}

}

