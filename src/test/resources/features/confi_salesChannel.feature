@configSalesChannel
Feature: Configuration sales channel verification

  Scenario:User should be able to login
  When User is on BriteERP loginpage
  And User input "username" in username box
  And User input "password" in password box
  Then User should be able to login

  Scenario:verifying Sales channel module
    When user click on sales channel
    And user selects european check box
    And user clicks on action drop down
    And user clicks on Export
    And check if Export type is selected by default
    And check if Export forms is selected by default
    And user clicks on sales channel from the list
    And user clicks on Add button
    And verifying sales channel text is displayed
    Then user clicks on Export to file
