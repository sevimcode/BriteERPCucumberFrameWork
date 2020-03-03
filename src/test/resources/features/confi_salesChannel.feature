@configSalesChannel
Feature: Configuration sales channel verification



  Scenario:verifying Sales channel module
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    Then Click on CRM module
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
