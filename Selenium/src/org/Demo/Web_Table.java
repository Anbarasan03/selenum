package org.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbu\\Downloads\\selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		System.out.println("ALL DATAS");
		List<WebElement> data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement table : data) {
               System.out.println(table.getText());
		}

		driver.findElement(By.name("vital")).click();
		WebElement f = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));//normal xpath for check boox
		f.click();
		boolean d = f.isSelected();
		System.out.println(d);
		WebElement r = driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]"));
		System.out.println(r.getText());
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement w : row) {
			System.out.println(w.getText());
		}
		
	}

}
