
Feature: Login

  Background:
    Given user open browser to url swag lags

  @TC01
  Scenario: Verify user succesfully login with credential standar user on Login page
    Given user on Login Page
    And user Input username "user1" on Login Page
    And user Input password "user1" on Login page
    When user click button login on Login Page
    Then user succes login with credential application
