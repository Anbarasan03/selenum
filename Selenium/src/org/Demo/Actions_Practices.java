package org.Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Practices {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	Actions a= new Actions(driver);
	//a.click(ele).build().perform();
	a.moveToElement(ele).build().perform();
	Thread.sleep(2000);
	a.doubleClick(ele).build().perform();
	Thread.sleep(2000);
	WebElement mobile = driver.findElement( By.xpath("(//a[@class='nav-a  '])[2]"));
	a.contextClick(mobile).build().perform();
	
	Robot s=new Robot();
	s.keyPress(KeyEvent.VK_DOWN);
	s.keyRelease(KeyEvent.VK_DOWN);
	s.keyPress(KeyEvent.VK_DOWN);
	s.keyRelease(KeyEvent.VK_DOWN);
	s.keyPress(KeyEvent.VK_DOWN);
	s.keyRelease(KeyEvent.VK_DOWN);
	s.keyPress(KeyEvent.VK_ENTER);
	s.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	Set<String> set = driver.getWindowHandles();
	for (String id : set) {
		driver.switchTo().window(id);
		System.out.println(id);
		

	}

	}

}
