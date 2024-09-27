@employee
Feature: Employee
  In order to manage employee records
  As an admin
  I would like to add, edit, delete employee details

  @addemployee
  Scenario Outline: AddValidEmployeeRecord
    Given I have browser with orangehrm application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on PIM menu
    And I click on Add Employee menu
    And I fill the employee detail
      | firstname | middlename   | lastname |
      | <fname>   | <middlename> | <lname>  |
    And I click on save
    Then I should get profile name as '<fname> <lname>'
    And I should get full name in the text field

    Examples: 
      | username | password | fname | middlename | lname |
      | Admin    | admin123 | john  | w          | wick  |
      | Admin    | admin123 | peter | ken        | kim   |
