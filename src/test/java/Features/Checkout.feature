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
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart
    And User click on the cart
    And User click on the checkout button
    And User enter "David" on the first name field
    And User enter "Miller" on the last name field
    And User enter "112233" on the postal code field
    And User click on the continue button in step one
#    Then User should see all products
    And User should see payment information
    And User should see shipping information
    And User should see item total price
    And User should see total tax
    And User should see total price
    And User click on the Finish button
    Then User see the checkout complete message
    And User see the Back home button
    And User see the welcome message on the screen


  Scenario: add product > checkout > input info > continue > cancel
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart
    And User click on the cart
    And User click on the checkout button
    And User enter "David" on the first name field
    And User enter "Miller" on the last name field
    And User enter "34134" on the postal code field
    And User click on the continue button in step one
    Then User should be on the checkout step two page
    And User click on the cancel button on step two
    Then User should be on the product page



  Scenario: add product >cart> checkout > cancel
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart
    And User click on the cart
    And User click on the checkout button
    And User click on the cancel button in step one
    Then User should on the cart page


  Scenario: add product > checkout > validate information input fields
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart
    And User click on the cart
#    And wait for a while
    And User click on the checkout button
    And User enter "Miller" on the last name field
    And User enter "112233" on the postal code field
    And User click on the continue button in step one
    Then User should see the "Error: First Name is required" error message
    And User click on the error message close button
#    Then Error message should be invisible
    And User enter "David" on the first name field
    And User remove last name
    And User click on the continue button in step one
    Then User should see the "Error: Last Name is required" error message
    And User enter "Miller" on the last name field
    And User remove postal code
    And User click on the continue button in step one
    Then  User should see the "Error: Postal Code is required" error message

  Scenario: Make a successful checkout
    Given User on the login page
    When User enter "standard_user" in the username field
    And User enter "secret_sauce" in the password field
    And User click on the login button
    And User add first product to the cart
    And User add second product to the cart
    And User click on the cart
    And User click on the checkout button
    And User enter "David" on the first name field
    And User enter "Miller" on the last name field
    And User enter "112233" on the postal code field
    And User click on the continue button in step one
    And User click on the Finish button
    Then User see the checkout complete message
    And User see the Back home button
    And User see the welcome message on the screen
