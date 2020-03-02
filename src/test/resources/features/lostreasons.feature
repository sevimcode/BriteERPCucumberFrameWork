Feature: Lost Reasons Page functionality
  ​
  Background: User is on the main page
    When User is on BriteERP loginpage
    And User input "username" in username box
    And User input "password" in password box
    And User should be click login button
    And User is on Lost Reasons page

  @lostReasonsSearch
  Scenario: Using Search button on the page
    When User enters "Too expensive" to the Search field
    Then User should be able to see "Advanced Search" button available for click
    When User clicks on "Advanced Search" button
    Then New buttons "Filters", "Group By" and "Favourites" should appear under the Search field

  @lostReasonsNameCheckbox
  Scenario:Verifying Name checkboxes
    When User check if "Action" button is on the page and clicks
    Then User should be able to see dropdown menu available for click

    @lostReasonsCreateImportButton
      Scenario: Verifying Create and Import button
      When User is on Lost Reasons page
      Then User finds "Create" button and clicks it
      And User enters any new name in "Name" field and clicks Save