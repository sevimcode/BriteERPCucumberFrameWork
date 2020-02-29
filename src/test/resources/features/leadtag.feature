Feature: Leads and Opportunities Lead Tag functionality
  ​
  Background: Login
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    And Click on CRM module
    And Click on Lead Oportunities
    And Click on Lead Tags

    Scenario: Verifying create button on Lead Tag
      Then User should be able to search on lead tags