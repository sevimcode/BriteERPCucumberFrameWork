Feature: CRM module landing page verification

  Background: Login
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    And Click on CRM module

  @smoke
  Scenario:User should be able to see Pipeline_Pipeline
    Then User should be able to see Pipeline_Pipeline on the menu

  @smoke
  Scenario:User should be able to see Pipeline_Quotation
    Then User should be able to see Pipeline_Quotation on the menu


  @smoke
  Scenario:User should be able to see Config Activity Types
    Then User should be able to see Config Activity Types on the menu

  @smoke
  Scenario:User should be able to see Config Sale Channels
    Then User should be able to see Config Sale Channels on the menu

  @smoke
  Scenario:User should be able to see Lead Oportunities
    Then User should be able to see Lead Oportunities on the menu


  @smoke
  Scenario:User should be able to see Lead Tags
    Then User should be able to see Lead Tags on the menu

#  @smoke
#  Scenario:User should be able to see Lost Reasons
#    Then User should be able to see Lost Reasons on the menu

  @smoke
  Scenario:User should be able to see Report Pipeline
    Then User should be able to see Report Pipeline on the menu

  @smoke
  Scenario:User should be able to see Report Activity
    Then User should be able to see Report Activity on the menu

  @smoke
  Scenario:User should be able to see Report Sale Channels
    Then User should be able to see Report Sale Channels on the menu


