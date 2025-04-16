Feature: Cart Page Validation
  Background:
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart

  Scenario: product added to cart should display in the cart
    When User click on the cart
    Then User should see the list of products

  Scenario: Total products in cart and cart badge number should be same
    When User click on the cart
    Then User should see "2" items in the cart badge

  Scenario: Remove and add items to cart should decrease and increase the number from cart badge
    When User click on the cart
    Then User should see "2" items in the cart badge
    And User remove one item from cart
    Then User should see "1" items in the cart badge
    And User click on continue shopping
    And User add first product to the cart
    And User add second product to the cart
    Then User should see "3" items in the cart badge
