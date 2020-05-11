package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("3476353125");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Assel250593");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logoutMenu")).click();
		driver.findElement(By.linkText("Log Out")).click();
		
		
		System.out.println("You succesfully loged in");

		Thread.sleep(2000);

	}
	

}

