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

  Scenario: Verifying search button on Lead Tag
      Then User should be able to search on lead tags

  Scenario: Verifying create button on Lead Tag
    Then User should be able to create on lead tags

  Scenario: Verifying import button on Lead Tag
    Then User should be able to import on lead tags

  Scenario: Verifying advance search button on Lead Tag
    Then User should be able to advance search on lead tags

  Scenario: Verifying filter dropdown button on Lead Tag
    Then User should be able to filterdropdown search on lead tags

  Scenario: Verifying search display button on Lead Tag
    Then User should be able to search display search on lead tags



