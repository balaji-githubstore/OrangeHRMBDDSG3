@login
Feature: Login
  In order to maintain the employees records 
  As an admin
  I want to login to the orange HRM dashboard

  @valid @high
  Scenario: Valid Credential
    Given I have browser with OrangeHRM application
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should get access to the portal with url as 'https://opensource-demo.orangehrmlive.com/index.php/dashboard'

  @invalid @low
  Scenario Outline: Invalid Credential
    Given I have browser with OrangeHRM application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should not get access to the portal with error as 'Invalid credentials'

    Examples: 
      | username | password |
      | peter    | peter123 |
      | john     | john123  |

