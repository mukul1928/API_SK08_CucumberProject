Feature: Validate the items added to the cart

  Scenario: Validate login
    Given user logins into the web page
    And user enters credentials
    And user clicks on submit button

  Scenario: Validate addition to cart
    Given user logins into the web page
    And user enters credentials
    And user clicks on submit button
    And user searches as item
    And user adds the item at the cart
    Then user verifies item added to cart
