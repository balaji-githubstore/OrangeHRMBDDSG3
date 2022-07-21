package com.sg.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.sg.hooks.AutomationHooks;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {

	@When("I click on PIM")
	public void i_click_on_pim() {
	    
	    AutomationHooks.driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}
	
	@When("I click on Add Employee")
	public void i_click_on_add_employee() {
		 AutomationHooks.driver.findElement(By.linkText("Add Employee")).click();
	}
	
	@When("I fill the employee details")
	public void i_fill_the_employee_details(DataTable dataTable) {
	    
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println(dataTable);
	    
	    List<Map<String, String>> lists=dataTable.asMaps();
	    String firstName=lists.get(0).get("firstname");
	    String middleName=lists.get(0).get("middlename");
	    String lastName=lists.get(0).get("lastname");
	    String employeeId=lists.get(0).get("employee_id");
	    String image=lists.get(0).get("photograph");
	    
	    AutomationHooks.driver.findElement(By.id("firstName")).sendKeys(firstName);
	    //fill the form
	}
	@When("I click on save")
	public void i_click_on_save() {
	    
	    //click on save
	}
	@Then("I should see the added employee details")
	public void i_should_see_the_added_employee_details() {
	    
	    //will do it tomorrow
	}

}
