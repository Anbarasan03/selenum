package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
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
		//single drop down
		//day
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s= new Select(day);
		s.selectByValue("8");
		//month
		WebElement month = driver.findElement(By.id("month"));
		Select d= new Select(month);
		d.selectByVisibleText("Dec");
		//year
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select f= new Select(year);
		f.selectByValue("1999");
		//radio button
		WebElement radio = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		radio.click();
		
		
		
		

	}

}
