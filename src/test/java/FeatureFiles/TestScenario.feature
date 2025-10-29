Feature: Validate the items added to the cart

  Background: 
    Given user logins into the web page
    And user enters credentials
    And user clicks on submit button

  Scenario: Validate login
    And user navigates to homepage of application
    Then user verifies the page title

  @sanity
  Scenario: Validate addition to cart
    And user searches as item
    And user adds the item at the cart
    Then user verifies item added to cart
