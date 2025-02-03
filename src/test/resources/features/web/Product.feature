Feature: Product

  Background:

  Scenario: Verify user could be direct to Basket Page after atc product on Product Detail Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    When user click product on Dashboard Page
    And user should see "product" name on Product Detail Page
    And user should see "product" price on Product Detail Page
    And user should see button Add to cart on Product detail Page
    When user click button add to cart on Product Detail Page
    Then user click icon basket in right on Product Detail Page
    And user should see label secondary header "Your Cart" on Cart Page