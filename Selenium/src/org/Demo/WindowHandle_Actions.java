package org.Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle_Actions {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions a= new Actions(driver);
	a.contextClick(mobile).build().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//String id = driver.getWindowHandle();
	//System.out.println(id);
	Thread.sleep(4000);
	Set<String> set = driver.getWindowHandles();
	for (String id : set) {
		driver.switchTo().window(id);
		System.out.println(id);
		
	}

	}

}
