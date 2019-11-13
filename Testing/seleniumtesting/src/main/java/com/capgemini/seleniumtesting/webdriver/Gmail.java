package com.capgemini.seleniumtesting.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	static {
		System.setProperty("webdriver.chrome.driver", "/Testing/seleniumtesting/src/main/resources/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.get("https://www.gmail.com");
		//enter the valid username
		driver.findElement(By.id("identifierId")).sendKeys("aishpatil10@gmail.com");
		//click on text
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//enter the valid password
		driver.findElement(By.name("password")).sendKeys("aishu");
	}
}
