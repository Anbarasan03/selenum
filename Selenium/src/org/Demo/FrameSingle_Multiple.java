package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSingle_Multiple {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	
	WebElement fs = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	driver.switchTo().frame(fs);
	driver.findElement(By.id("Click")).click();
	
	driver.switchTo().defaultContent();
	
	
	WebElement gh = driver.findElement(By.xpath("//iframe[@src='page.html']"));
driver.switchTo().frame(gh);
driver.findElement(By.id("Click1")).click();
	

	}
}
