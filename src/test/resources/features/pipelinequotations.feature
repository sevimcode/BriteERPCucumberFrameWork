Feature: Pipeline quotations
@asel
Scenario:User should be able to login
When User is on BriteERP loginpage
And User input "username" in username box
And User input "password" in password box
Then User should be able to login

@asel
Scenario:User should be able to click CRM module
  When User is on BriteERP loginpage
  And User input "username" in username box
  And User input "password" in password box
  Then User should be able to login
When User is on BriteERP Landing page
And User clicks on CRM module
Then user should be able to see the CRM module Landing page

@asel
Scenario:User should be able to click pipeline quotations
  When User is on BriteERP loginpage
  And User input "username" in username box
  And User input "password" in password box
  Then User should be able to login
  When User is on CRM landing page
  And User clicks on quotations
  Then User should be ble to see pipeline quotations page


