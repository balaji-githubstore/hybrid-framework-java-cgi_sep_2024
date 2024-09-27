#@employee
#Feature: Employee
  #In order to manage employee records
  #As an admin
  #I would like to add, edit, delete employee details
#
  #@addemployee
  #Scenario: AddValidEmployeeRecord
    #Given I have browser with orangehrm application
    #When I enter username as 'Admin'
    #And I enter password as 'admin123'
    #And I click on login
    #And I click on PIM menu
    #And I click on Add Employee menu
    #And I fill the employee detail
      #| firstname | middlename | lastname |
      #| john      | w          | wick     |
    #And I click on save
    #Then I should get profile name as 'john wick'
    #And I should get full name in the text field
#
  #@addemployee
  #Scenario: AddValidEmployeeRecord2
    #Given I have browser with orangehrm application
    #When I enter username as 'Admin'
    #And I enter password as 'admin123'
    #And I click on login
    #And I click on PIM menu
    #And I click on Add Employee menu
    #And I fill the employee detail
      #| firstname | middlename | lastname |
      #| kim       | w          | ken      |
    #And I click on save
    #Then I should get profile name as 'john wick'
    #And I should get full name in the text field
