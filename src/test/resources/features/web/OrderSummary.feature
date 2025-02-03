Feature: Order Summary

  Background:
    Given user open browser to url swag lags
    And user login to web application with "user1" on Login Page

  @TC18
  Scenario: Verify user successfully create order on Order Summary Page
    Given user on Dashboard Page
    And user should see title "Products" on Dashboard Page
    When user click product on Dashboard Page
    And user click button add to cart on Product Detail Page
    And user click icon basket in right on Product Detail Page
    Then the calculation of product price is correct on Basket Page
    And user click button checkout on Basket Page
    And user input information detail on Order Summary Page
    And user click button continue on Order Summary Page
    And user should see sub total is correct on Order Summary page
    And the calculation of tax order on Order Summary Page
    Then the calculation of total amount is correct on Order summary Page
    When user click button finish on Order Summary Page
    Then user should success order product with message "Thank you for your order!" on Thank you Page
