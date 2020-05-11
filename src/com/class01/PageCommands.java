package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		// http--> hyper text transfer protocol
		driver.get("http://www.google.com");

		final String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("The actual and expected title did matched");
		} else {
			System.err.println("The actual and expected title did not matched");
		}
		
		System.out.println("***************");

		String expectedUrl="https://www.google.com/?gws_rd=ssl";
		String actualUrl = driver.getCurrentUrl();
		
	
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL matched");
		}else {
			System.err.println("Actual and expected Not Matched");
		}
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		

	}

	
}
