package org.Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dress_Order {
	
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.findElement(By.className("login")).click();
			driver.findElement(By.id("email")).sendKeys("anji@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("12345");
			driver.findElement(By.id("SubmitLogin")).click();
			Thread.sleep(2000);
			WebElement drs = driver.findElement(By.className("sf-with-ul"));
			Actions a=new Actions(driver);
			a.moveToElement(drs).build().perform();
			driver.findElement(By.xpath("//a[text()='Evening Dresses']")).click();
			Thread.sleep(3000);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			WebElement ins = driver.findElement(By.xpath("//span[text()='Properties']"));
			js.executeScript("arguments[0].scrollIntoView()",ins );
			Thread.sleep(1000);
			WebElement dv = driver.findElement(By.xpath("//div[@class='product-container']"));
			a.moveToElement(dv).build().perform();
			driver.findElement(By.xpath("//a[@class='quick-view']")).click();
			WebElement ab = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(ab);
			driver.findElement(By.name("Submit")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
			js.executeScript("window.scrollBy(0,2000)");
			driver.findElement(By.name("message")).sendKeys("Proceed to Shipping");
			driver.findElement(By.name("processAddress")).click();
			js.executeScript("window.scrollBy(0,2000)");
			driver.findElement(By.name("cgv")).click();
			driver.findElement(By.name("processCarrier")).click();
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Screenshrt\\pic8.png");
			FileHandler.copy(source, dest);
			driver.findElement(By.xpath("//a[@class='bankwire']")).click();
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(3000);
			TakesScreenshot ts1=(TakesScreenshot) driver;
			File source1 =ts1.getScreenshotAs(OutputType.FILE);
			File dest1=new File("C:\\\\Users\\\\Anbu\\\\Downloads\\\\selenium\\\\Selenium\\\\Screenshrt\\\\pic9.png");
			FileHandler.copy(source1, dest1);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(3000);
			TakesScreenshot ts2=(TakesScreenshot) driver;
			File source2 =ts2.getScreenshotAs(OutputType.FILE);
			File dest2=new File("C:\\\\Users\\\\Anbu\\\\Downloads\\\\selenium\\\\Selenium\\\\Screenshrt\\\\pic10.png");
			FileHandler.copy(source2, dest2);
			
			
			
			
			
			
	}

}
