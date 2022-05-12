package org.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
