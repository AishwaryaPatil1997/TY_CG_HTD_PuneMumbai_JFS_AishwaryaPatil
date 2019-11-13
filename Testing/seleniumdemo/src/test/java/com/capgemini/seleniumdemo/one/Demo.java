package com.capgemini.seleniumdemo.one;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static {
		System.setProperty("webdriver.chrome.driver", "/Testing/seleniumtesting/src/main/resources/chromedriver.exe");
	}

	@Test
	public void test() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.actiTime.com/");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);

		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();

		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}
}
