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
import org.openqa.selenium.support.ui.Select;



public class Drop_Down {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("anbu");
	driver.findElement(By.name("lastname")).sendKeys("m");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("123456782");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("anbu@5678");
	
	
	
	WebElement multi = driver.findElement(By.xpath("(//select)[1]"));
	Select ar = new Select(multi);
	ar.selectByValue("08");
	
	WebElement multi1 = driver.findElement(By.xpath("(//select)[2]"));
	Select as = new Select(multi1);
	as.selectByValue("12");
	
	WebElement multi2 = driver.findElement(By.xpath("(//select)[2]"));
	Select ae = new Select(multi2);
	ae.deselectByValue("1999");
	
	driver.findElement(By.name("sex")).click();
	Thread.sleep(8000);
	
	TakesScreenshot sc =(TakesScreenshot)driver;
	File start =  sc.getScreenshotAs(OutputType.FILE);
	File end=new File("C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Screenshrt\\pic2.PNG");
	FileHandler.copy(start, end);
	
	

	}

}
