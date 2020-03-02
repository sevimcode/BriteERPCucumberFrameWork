Feature:

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

    @buggie
    Scenario:User should be able to click configuration activity feature
      When User is on BriteERP loginpage
      And User input "username" in username box
      And User input "password" in password box
      And User should be click login button
      Then Click on CRM module
      And User clicks on activity types under configuration feature
      Then User should be ble to see activity types page

