package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Methods {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;//narrowing type casting
	WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));
    js.executeScript("arguments[0].scrollIntoView()",fb);//	Go to last page
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,-1500)");
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,-2100)"); 
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,+2000)");
    driver.close();
    
	

	}

}
