Feature: Login
  In order to maintain the employees records 
  As an admin
  I want to login to the orange HRM dashboard

  Scenario: Valid Credential
    Given I have browser with OrangeHRM application
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should get access to the portal with url as 'https://opensource-demo.orangehrmlive.com/index.php/dashboard'

  Scenario: Invalid Credential
    Given I have browser with OrangeHRM application
    When I enter username as 'john'
    And I enter password as 'john123'
    And I click on login
    Then I should not get access to the portal with error as 'Invalid credentials'
