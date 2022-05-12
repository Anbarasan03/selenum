package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
	    System.out.println(url);
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
				user.sendKeys("abcg@gmail.com");
				WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
				pwd.sendKeys("123445");
				WebElement login = driver.findElement(By.name("login"));
				login.click();
				//WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
				//login.sendKeys("123456");
				

	}

}
