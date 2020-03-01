Feature: Pipeline quotations

Scenario:User should be able to login
When User is on BriteERP loginpage
And User input "username" in username box
And User input "password" in password box
  And User should be click login button
Then User should be able to login


Scenario:User should be able to click CRM module
  When User is on BriteERP loginpage
  And User input "username" in username box
  And User input "password" in password box
  And User should be click login button
  Then Click on CRM module
Then user should be able to see the CRM module Landing page

  @asel
Scenario:User should be able to click pipeline quotations
  When User is on BriteERP loginpage
  And User input "username" in username box
  And User input "password" in password box
  And User should be click login button
  Then Click on CRM module
  And User clicks on quotations
  Then User should be ble to see pipeline quotations page


