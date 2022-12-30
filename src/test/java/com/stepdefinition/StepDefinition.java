package com.stepdefinition;


import java.util.Optional;


import com.Maven_Cucumber.BaseClass;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	/*@Before
	public void beforeHooks(Scenario s) {
		
     Optional<String> name = s.getName();
     System.out.println(name);

	}
	@After
	public void afterhooks(Scenario s) {
	
		Location location = s.getLocation();
		System.out.println(location);
			
	}*/
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();  
        urlLaunch(url);
		
	}
	
	@When("user Enter The {string} In The Username Field")                            //parameterized data
	public void user_enter_the_in_the_username_field(String username) {
		sendKeys(pom.getInstanceLoginPage().getUsername(), username);
		
	}

	@When("user Enter The {string} In The Password Field")                           //parameterized data
	public void user_enter_the_in_the_password_field(String password) {
		sendKeys(pom.getInstanceLoginPage().getPassword(), password);
		
	}

	@Then("^user Click The Login Key It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Key_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		
		clickElement(pom.getInstanceLoginPage().getLogin());
		
		
	}

}
