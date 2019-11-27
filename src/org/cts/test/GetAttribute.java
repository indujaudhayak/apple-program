package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\induja udhayak\\Apple\\lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement usename = driver.findElement(By.id("email"));
usename.sendKeys("8012222872");
WebElement pass = driver.findElement(By.id("pass"));	
pass.sendKeys("induja ");
  String s    =pass.getAttribute("value");
	System.out.println(s);
	
	
	
	
	}

}
