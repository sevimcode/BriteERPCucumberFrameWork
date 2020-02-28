Feature: Reports functions
  @smoke
  Scenario: User should see pipeline reports
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    Then Click on CRM module
    Then Click on Pipeline under Reporting section
    Then User should see pipeline report or message that report is not available
  @smoke
  Scenario: User should see activity reports
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    Then Click on CRM module
    Then Click on Activities under Reporting section
    Then User should see activities report or message that report is not available
  @dmytro @smoke
  Scenario: User should see sale channel reports
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    Then Click on CRM module
    Then Click on Sales Channels under Reporting section
    Then User should see sales channels report or message that report is not available