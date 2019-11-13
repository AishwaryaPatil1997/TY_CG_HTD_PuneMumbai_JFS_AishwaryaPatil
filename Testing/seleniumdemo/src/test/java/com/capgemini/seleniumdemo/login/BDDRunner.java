package com.capgemini.seleniumdemo.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.capgemini.seleniumdemo.login" }, dryRun = true)
public class BDDRunner extends AbstractTestNGCucumberTests {

}
