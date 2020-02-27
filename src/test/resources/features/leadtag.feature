Feature: Leads and Opportunities Lead Tag functionality
  ​
  @positivelogin @smoke
  Scenario:User should be able to login
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    Then User should be able to login

  @negativelogin @smoke
  Scenario:User should be able to see message when enter wrong password
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "wrongPassword" in password box
    And User should be click login button
    Then User should be able to see message
