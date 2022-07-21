package com.sg.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sg.hooks.AutomationHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	@Given("I have browser with OrangeHRM application")
	public void i_have_browser_with_orange_hrm_application() {
		
		WebDriverManager.chromedriver().setup();
		
		AutomationHooks.driver = new ChromeDriver();
		AutomationHooks.driver.manage().window().maximize();
		AutomationHooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		AutomationHooks.driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) 
	{
		AutomationHooks.driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		AutomationHooks.driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		AutomationHooks.driver.findElement(By.cssSelector("[name='Submit']")).click();
	}

	@Then("I should get access to the portal with url as {string}")
	public void i_should_get_access_to_the_portal_with_url_as(String expectedUrl) {
		
		Assert.assertEquals(AutomationHooks.driver.getCurrentUrl(), expectedUrl);
	}
	
	@Then("I should not get access to the portal with error as {string}")
	public void i_should_not_get_access_to_the_portal_with_error_as(String expectedError) {
	    
		String actualError=AutomationHooks.driver.findElement(By.id("spanMessage")).getText();
		Assert.assertTrue(actualError.contains(expectedError)); //should be true
	}

}





