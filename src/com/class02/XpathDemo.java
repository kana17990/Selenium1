package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");

		
		//form[starts-with(@action,'/humanresource')]
		
		
		
}
}