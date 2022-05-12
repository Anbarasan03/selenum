package com.TenAm;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
	public static void  Browser_Lanuch() {
	System.setProperty("webdriver.chrome.driver","");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void ClickonWebelement(WebElement element) {
		element.click();
	}
	
	
}
