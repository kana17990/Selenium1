package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		// ChromeDriver initialization
		WebDriver driver = new ChromeDriver();
		// navigating to Google
		driver.get("http://www.google.com");
		// navigating to NewTours website
		driver.navigate().to("http://newtours.demoaut.com");
        //clicking to Register button
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		// Entering users firstname
		driver.findElement(By.name("firstName")).sendKeys("Kanat");
		Thread.sleep(1000);
		// Entering users lastname
		driver.findElement(By.name("lastName")).sendKeys("Ussenov");
		Thread.sleep(1000);
		// Entering phone number
		driver.findElement(By.name("phone")).sendKeys("3476353125");
		Thread.sleep(1000);
		// Entering users email adress
		driver.findElement(By.id("userName")).sendKeys("kanaussenov@gmail.com");
		Thread.sleep(1000);
		// Entering users adress
		driver.findElement(By.name("address1")).sendKeys("3093 Brighton 4th,1C");
		Thread.sleep(1000);
		// Entering city
		driver.findElement(By.name("city")).sendKeys("Brooklyn");
		Thread.sleep(1000);
		// Entering postal zip code
		driver.findElement(By.name("postalCode")).sendKeys("11235");
		Thread.sleep(1000);
		// Enetring users email information
		driver.findElement(By.id("email")).sendKeys("kanaussenov@gmail.com");
		Thread.sleep(1000);
		// Eneterign users password
		driver.findElement(By.name("password")).sendKeys("Kanat12291989");
		Thread.sleep(1000);
		// Confirming users password
		driver.findElement(By.name("confirmPassword")).sendKeys("Kanat12291989");
		Thread.sleep(1000);
		// Clicking on register button
		driver.findElement(By.name("register")).click();
		Thread.sleep(3000);

		driver.close();
		System.out.println("You have successfully registered");
	}
	

	
}
