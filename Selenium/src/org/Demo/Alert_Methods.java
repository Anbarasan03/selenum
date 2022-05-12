package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	driver.switchTo().alert().sendKeys("anbu");
	driver.switchTo().alert().accept();
	driver.switchTo().alert().getText();
	

	}

}
