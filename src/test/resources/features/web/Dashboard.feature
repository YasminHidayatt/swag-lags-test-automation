
Feature: Dashboard

  Background:
    Given user open browser to url swag lags
    And user login to web application with "user1" on Login Page

  @TC07
  Scenario: Verify user should see list product on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    Then user should see list item product catalog on Dashboard Page

  @TC08
  Scenario: Verify user could be atc product on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    And user should see "product1" name on Dashboard Page
    And user should see "product1" price on Dashboard Page
    When user could be atc product on Dashboard Page
    Then user should see count "1" product in icon basket on Dashboard Page

  @TC09
  Scenario: Verify user could filter product by asc on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Name (A to Z)" in dropdown filter on Dashboard Page
    Then user should see product name after filter by asc on Dashboard Page
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |

  @TC10
  Scenario: Verify user could be filter product by desc on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Name (Z to A)" in dropdown filter on Dashboard Page
    Then user should see product name after filter by desc on Dashboard Page
      | Test.allTheThings() T-Shirt (Red) |
      | Sauce Labs Onesie                 |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Bike Light             |
      | Sauce Labs Backpack               |

  @TC11
  Scenario: Verify user should see price product from low to high after apply filter on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Price(low to high)" in dropdown filter on Dashboard Page
    Then user should see product price after filter by price on Dashboard Page
      | 7.99  |
      | 9.99  |
      | 15.99 |
      | 15.99 |
      | 29.99 |
      | 49.99 |

  @TC12
  Scenario: Verify user should see product price from High to Low after apply filter on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    And user should see button filter on Dashboard Page
    When user could choose filter by "Price(high to low)" in dropdown filter on Dashboard Page
    Then user should see product price after filter by price on Dashboard Page
      | 49.99 |
      | 29.99 |
      | 15.99 |
      | 15.99 |
      | 9.99  |
      | 7.99  |

  @TC13
  Scenario: Verify user should be direct to product detail after choose product on Dashboard Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    When user click product on Dashboard Page
#    Then user succes direct to product detail Page
#    And user should see "product1" name on Product Detail Page