package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("3476353125");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Assel250593");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
