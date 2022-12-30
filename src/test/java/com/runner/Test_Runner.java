package com.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Cucumber.BaseClass;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",
                   glue = "com\\stepdefinition",monochrome = true,
                  dryRun = false,tags =("@SmokeTest"),
                  plugin = {"html:Reportt","json.Reportt/cucumber.json",
                		  "com.cucumber.listener.ExtentCucumberFormatter:Reportt/re.html"})

public class Test_Runner {
	
	public static WebDriver driver;//null
	
	@BeforeClass
	public static void setUp() {
		
		driver = BaseClass.browserLaunch("chrome");
        
	}
	@AfterClass
	public static void tearDown() throws InterruptedException {
       
		BaseClass.closeBrowser();
	}
	
	

}
