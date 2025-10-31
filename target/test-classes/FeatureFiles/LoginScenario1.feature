@sanity 

Feature: Login Scenario Test

  Scenario: Validate FB Application with correct username and password
    Given user is on the login page
    When user enters username
    And user enters password
    And user clicks on submit button
    #But user credentials are wrong
    #Then an error message should be displayed on webpage