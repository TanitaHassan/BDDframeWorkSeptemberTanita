package com.facebook.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {

	WebDriver driver;
	@Given("I open facebook application")
	public void iOpenFacebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	@When("enter my valid user name")
	public void enterMyValidUserName() {
		driver.findElement(By.id("email")).sendKeys("jjj");
	   
	}
	@When("enter my valid password")
	public void enterMyValidPassword() {
		driver.findElement(By.id("pass")).sendKeys("jjj");
	}
	@When("I click login button")
	public void iClickLoginButton() {
	    
	}
	@Then("i can be logged in")
	public void iCanBeLoggedIn() {
	    
	}



}
