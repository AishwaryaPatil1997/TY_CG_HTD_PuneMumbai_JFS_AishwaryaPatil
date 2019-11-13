package com.capgemini.seleniumdemo.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	static {
		System.setProperty("webdriver.chrome.driver", "/Testing/seleniumtesting/src/main/resources/chromedriver.exe");
	}
	
	WebDriver driver;
	
	@Given("^the user has loaded the application in the browser$")
	public void the_user_has_loaded_the_application_in_the_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://demo.actiTime.com/");
	}

	@When("^the user enters the valid username$")
	public void the_user_enters_the_valid_username() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
	}

	@Then("^the dashboard page must be  displayed$")
	public void the_dashboard_page_must_be_displayed() throws Throwable {
		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();

		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

//	@When("^the user enters the invalid password$")
//	public void the_user_enters_the_invalid_password() throws Throwable {
//		driver.findElement(By.name("pwd")).sendKeys("admin");
//	}
//
//	@Then("^the user should be in the same page$")
//	public void the_user_should_be_in_the_same_page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

}
