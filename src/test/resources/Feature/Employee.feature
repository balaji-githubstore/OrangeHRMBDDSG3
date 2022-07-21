@employee
Feature: Employee
  In order to handle employee details 
  As an admin
  I would to create, edit, delete employee details

  @addemployee @high
  Scenario: Add Employee
    Given I have browser with OrangeHRM application
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    And I click on PIM
    And I click on Add Employee
    And I fill the employee details
      | firstname | middlename | lastname | employee_id | photograph  |
      | John      | K          | wick     |         890 | emp_809.png |
    And I click on save
    Then I should see the added employee details
