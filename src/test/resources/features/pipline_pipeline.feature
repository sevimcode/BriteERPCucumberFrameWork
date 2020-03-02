Feature: As a manager I should be able to manage Pipeline pipeline


Scenario:User should be able to login
When User is on BriteERP loginpage
And User input "username" in username box
And User input "password" in password box
Then User should be able to login



Scenario: Verifying create button is displayed
  Given User  on BriteERP  page
  When User clicks on Crm module
  Then User should be able to see create button


  Scenario: Verifying create button functionality
    Given User on CRM page
    When Click on Create button
    And User fills all input boxes
    And User clicks on create button
    Then User should be able to see deal information under New column


    Scenario: Verify Search box is Displayed
      Given User  on BriteERP  page
      When User clicks on Crm module
      Then User should be able to see searchBox


      Scenario: Verify "My Pipeline Filter" displayed by default
        Given User  on BriteERP  page
        When User clicks on Crm module
        Then User should be able to see myPipeline filter


        Scenario: Verify Search Box Fuctionality
          Given User  on BriteERP  page
          When User clicks on Crm module
          And User navigates on search box
          And User input "company" in search box
          And User clicks on search button
          Then User should be able to see "company" information

