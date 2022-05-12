package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncogintoScreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
	    System.out.println(url);
	    String ti = driver.getTitle();
	    System.out.println(ti);
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

