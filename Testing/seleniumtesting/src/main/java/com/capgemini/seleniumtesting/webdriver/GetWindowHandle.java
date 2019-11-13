package com.capgemini.seleniumtesting.webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	static {
		System.setProperty("webdriver.chrome.driver", "/Testing/seleniumtesting/src/main/resources/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		System.out.println("number of windows: "+whs.size());
		System.out.println(whs);
		driver.quit();
	}
}
