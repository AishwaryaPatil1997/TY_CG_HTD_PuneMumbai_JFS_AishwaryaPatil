package com.capgemini.seleniumtesting.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {

	static {
		System.setProperty("webdriver.chrome.driver", "/Testing/seleniumtesting/src/main/resources/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();

	}
}
