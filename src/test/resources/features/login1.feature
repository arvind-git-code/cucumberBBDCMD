Feature: login functonality test

  Scenario: Check login with valid credientials
    Given user is on login page
    When user enter valid user id and password
    And click on login button
    Then user is nevidated to home page
	@smoke
  Scenario: check login with invalid creadientials
    Given user is on login page
    When user enter invalid user id and password
    And click on login button
    Then error message display - invalid crediential
