
Feature: Dashboard

  Background:
    Given user open browser to url swag lags
    And user login to web application with "user1" on Login Page

  @TC07
  Scenario: Verify user should see list product on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    Then user should see list item product catalog on Dashboard Page

  @TC08
  Scenario: Verify user could be atc product on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    And user should see "product1" name on Dashboard Page
    And user should see "product1" price on Dashboard Page
    When user could be atc product on Dashboard Page
    Then user should see count "1" product in icon basket on Dashboard Page

  @TC09
  Scenario: Verify user could filter product by asc on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Name (A to Z)" in dropdown filter on Dashboard Page
    Then user should see product name after filter by asc on Dashboard Pag

  @TC10
  Scenario: Verify user could be filter product by desc on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Name (Z to A)" in dropdown filter on Dashboard Page
    Then user should see product name after filter by desc on Dashboard Page

  @TC11
  Scenario: Verify user should see price product from low to high after apply filter on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Price(low to high)" in dropdown filter on Dashboard Page
    Then user should see product price after filter by price asc on Dashboard Page

  @TC12
  Scenario: Verify user should see product price from High to Low after apply filter on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Price(high to low)" in dropdown filter on Dashboard Page
    Then user should see product price after filter by price desc on Dashboard Page

  @TC13
  Scenario: Verify user should be direct to product detail after choose product on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Product" on Dashboard Page
    When user click product on Dashboard Page
    Then user succes direct to product detail Page
    And user should see "product" name on Product Detail Page