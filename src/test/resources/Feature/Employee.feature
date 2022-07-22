@employee
Feature: Employee
  In order to handle employee details 
  As an admin
  I would to create, edit, delete employee details

  @addemployee @high
  Scenario Outline: Add Employee
    Given I have browser with OrangeHRM application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on PIM
    And I click on Add Employee
    And I fill the employee details
      | firstname | middlename | lastname | employee_id | photograph     |
      | <fname>   | <mname>    | <lname>  | <emp_id>    | <image_detail> |
    And I click on save
    Then I should see the added employee details

    Examples: 
      | username | password | fname | mname | lname | emp_id | image_detail |
      | Admin    | admin123 | john  | k     | wick  |    907 | emp_890.png  |
      | Admin    | admin123 | Bala  | k     | D     |    909 | emp_890.png  |
