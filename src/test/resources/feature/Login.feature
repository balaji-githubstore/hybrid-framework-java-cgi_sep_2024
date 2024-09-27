@login
Feature: Login
  In order to manage the employee records
  As a admin
  I want to access the orange hrm portal

  Background: 
    Given I have browser with orangehrm application

	@valid @smoke
  Scenario: ValidLogin
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should access to the dashboard page with header as 'Dashboard'

	@invalid
  Scenario Outline: InvalidLogin
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should not get access to dashboard with error as '<expected_error>'

    Examples: 
      | username | password  | expected_error      |
      | peter    | peter1243 | Invalid credentials |
      | john     | john123   | Invalid credentials |
