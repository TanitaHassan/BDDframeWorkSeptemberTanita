package com.facebook.stepDefinations;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioOutlineStep extends BaseStep{
	LoginPage loginP;
	@Given("user enter {string}  and {string} to open application")
	public void userEnterAndToOpenApplication(String browser, String Url) {
		openApp(browser, Url);
		
	}
	@When("user enter {string} and {string} on the input field")
	public void userEnterAndOnTheInputField(String userName, String password) {
		loginP = new LoginPage(driver);
		loginP.userNameMethod(userName);
		loginP.passWordMethod(password);
		
	}
	

	@When("user click on loginButton")
	public void userClickOnLoginButton() {
	
		loginP.logingButton(); 
	}



	@Then("user close the application")
	public void userCloseTheApplication() {
		
		closeApp();
		
	}



}
