package org.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			//multiple drop down 
			WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
			Select f= new Select(multi);
			f.selectByValue("2");
			f.selectByIndex(3);
			f.selectByVisibleText("Selenium");
			
			boolean multiple = f.isMultiple();
			System.out.println(multiple);
			
			List<WebElement> list = f.getOptions();
			for (WebElement opt : list) {
				System.out.println(opt.getText());
				
				
				
			}
			
			

	}

}
