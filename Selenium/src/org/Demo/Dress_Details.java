package org.Demo;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dress_Details {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		Thread.sleep(3000);
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("anji@gmail.com");
        Thread.sleep(2000);
        WebElement account = driver.findElement(By.xpath("//i[@class='icon-user left']"));
        account.click();
        Thread.sleep(3000);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("anbu");
        driver.findElement(By.id("customer_lastname")).sendKeys("arasan");
        driver.findElement(By.id("passwd")).sendKeys("12345");
        Thread.sleep(9000);
        WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
        Select s= new Select(day);
        s.selectByValue("8");
        Thread.sleep(4000);
        WebElement month = driver.findElement(By.id("months"));
      Select m=new Select(month);
      m.selectByValue("12");
       Thread.sleep(3000);
        WebElement year = driver.findElement(By.id("years"));
        Select g=new Select(year);
       g.selectByValue("1999");
       Thread.sleep(3000);
       driver.findElement(By.id("newsletter")).click();
       driver.findElement(By.id("company")).sendKeys("abc company");
       driver.findElement(By.id("address1")).sendKeys("80c.nathakulam,tcr");
       driver.findElement(By.id("address2")).sendKeys("tuty,tamilnadu,india");
       driver.findElement(By.id("city")).sendKeys("thoothukudi");
       Thread.sleep(2000);
       WebElement state = driver.findElement(By.id("id_state"));
       Select t=new Select(state);
       t.selectByValue("2");
       driver.findElement(By.id("postcode")).sendKeys("55552");
       WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
       Select f=new Select( country);
       f.selectByVisibleText("United States");
       driver.findElement(By.id("other")).sendKeys("order my dress");
       driver.findElement(By.id("phone")).sendKeys("876543286");
       driver.findElement(By.id("phone_mobile")).sendKeys("6785486798");
       driver.findElement(By.id("alias")).sendKeys("thiruchendur");
       driver.findElement(By.xpath("//span[text()='Register']")).click();
       //Account Created.
     
      
       
	}

}
