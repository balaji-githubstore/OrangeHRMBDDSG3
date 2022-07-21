package com.sg.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	WebDriver driver;

	@Given("I have browser with OrangeHRM application")
	public void i_have_browser_with_orange_hrm_application() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.cssSelector("[name='Submit']")).click();
	}

	@Then("I should get access to the portal with url as {string}")
	public void i_should_get_access_to_the_portal_with_url_as(String expectedUrl) {

		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	}

}




