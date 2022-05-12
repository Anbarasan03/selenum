package org.Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("Muneeswaran");
	driver.findElement(By.id("password")).sendKeys("34L5T5");
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	WebElement loc = driver.findElement(By.id("location"));
	Select l=new Select(loc);
	l.selectByVisibleText("London");
	WebElement hot = driver.findElement(By.id("hotels"));
	Select h=new Select(hot);
	h.selectByVisibleText("Hotel Creek");
	WebElement room = driver.findElement(By.id("room_type"));
	Select r=new Select(room);
	r.selectByVisibleText("Double");
	WebElement num = driver.findElement(By.id("room_nos"));
	Select y=new Select(num);
	y.selectByValue("3");
	driver.findElement(By.id("datepick_in")).sendKeys("08/12/1999");
	driver.findElement(By.id("datepick_out")).sendKeys("12/12/1999");
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select t=new Select(adult);
	t.selectByValue("2");
	WebElement child = driver.findElement(By.id("child_room"));
	Select g=new Select(child);
	g.selectByIndex(2);
	driver.findElement(By.id("Submit")).click();
	WebElement click = driver.findElement(By.id("radiobutton_0"));
	click.click();
	driver.findElement(By.id("continue")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("first_name")).sendKeys("Muneeswaran");
	driver.findElement(By.id("last_name")).sendKeys("anbarasan");
	driver.findElement(By.id("address")).sendKeys("south streed,thiruchendur");
	driver.findElement(By.id("cc_num")).sendKeys("9876543223456789");
	WebElement card = driver.findElement(By.id("cc_type"));
	Select e=new Select(card);
	e.selectByVisibleText("VISA");
	WebElement exp = driver.findElement(By.id("cc_exp_month"));
	Select b=new Select(exp);
	b.selectByValue("3");
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select a=new Select(year);
	a.selectByValue("2014");
	driver.findElement(By.id("cc_cvv")).sendKeys("987");
	driver.findElement(By.id("book_now")).click();
	Thread.sleep(7000);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Screenshrt\\pic15.PNG");
    FileHandler.copy(source, destination);
	

	}

}
