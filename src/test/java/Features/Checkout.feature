Feature: Checkout Page
  
  Scenario: Presences of elements
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User click on the cart
    And User click on the checkout button
    Then User should see first name input field
    And First name field should be enabled
    And Placeholder text "First Name" field should be visible on first name field
    And User should see last name input field
    And Last name field should be enabled
    And Placeholder text "Last Name" field should be visible on last name field
    And User should see postal code input field
    And Postal code field should be enabled
    And Placeholder text "Zip/Postal Code" field should be visible on postal code field

    And User should see the continue button
    And Continue button should be enabled
    And Continue button back-ground color should be "rgba(61, 220, 145, 1)"
    And Continue button height should be "41"
    And Continue button width should be "220"
    And Continue button type should be "submit"
    And Continue button label should be "Continue"

    And User should see the cancel button
    And Cancel button should be enabled
    And Cancel button back-ground color should be "rgba(255, 255, 255, 1)"
    And Cancel button height should be "39"
    And Cancel button width should be "218"
    And Cancel button label should be "Cancel"

  Scenario: add product > checkout > input info > continue > finish > back home
  Scenario: add product > checkout > input info > continue > cancel
  Scenario: add product > checkout > cancel
