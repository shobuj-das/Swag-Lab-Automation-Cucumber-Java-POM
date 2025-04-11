Feature: Cart Page Validation
  Background:
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart

  Scenario: product added to cart should display in the cart
    When User click on the cart
    Then User should see the list of products

  Scenario: Total products in cart and cart badge number should be same
