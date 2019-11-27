package org.cts.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\induja udhayak\\Apple\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get(" http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\USER\\eclipse-workspace\\induja udhayak\\Apple\\screenshot.greens.png");
	FileUtils.copyFile(src, des);

	}


}
