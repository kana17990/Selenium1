package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmerica {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.bankofamerica.com");
		driver.findElement(By.id("onlineId1")).sendKeys("ussenov29");
		Thread.sleep(2000);
		driver.findElement(By.id("passcode1")).sendKeys("assel250593");
		Thread.sleep(2000);
		driver.findElement(By.id("signIn")).click();
		System.out.println("Id or Passcode is incorrect ");
	

	
	}
}
