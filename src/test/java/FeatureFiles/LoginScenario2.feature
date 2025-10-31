@smoke

Feature: Login Scenario Test

  Scenario Outline: Validate FB Application with correct username and password
    Given user is on the login page
    When user enters username as "<username>"
    And user enters password as "<password>"
    And user clicks on submit button
   

    Examples: 
      | username   | password |
      | mngr643521 | esypapE  |
      | mngr643524 | tYvamUg  |
