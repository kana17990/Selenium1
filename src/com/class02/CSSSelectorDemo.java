package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium1/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input.button")).click();
        //css = input[name='txtUsername'
		// input#txtUsername --> only if you have ID attribute
		// input.button dot(.)--> only use for class if there a space replace it with
		// (.)
		// input[name^='txt'] --> starts with CSS selector
		// input[name$='name'] --> $ sighn represents ends with CSS selector
        //input[id*='nL'] --> * keyword represents contains
	}

}
