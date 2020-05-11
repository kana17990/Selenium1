package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		// http--> hyper text transfer protocol
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
		//////browser navigation commands.
		
		//it will anvigate to a given url
		driver.navigate().to("http://www.facebook.com");
		
		//it will navigate back
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//it will navigate forward
		driver.navigate().forward();
		
		
		
		
		
		
	}
}
