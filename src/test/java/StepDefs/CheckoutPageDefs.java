package StepDefs;

import Pages.CartPage;
import Pages.Checkout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static StepDefs.Hooks.softAssert;

public class CheckoutPageDefs {
    Checkout checkout = new Checkout();
    CartPage cartPage = new CartPage();

    @And("User click on the checkout button")
    public void userClickOnTheCheckoutButton() throws InterruptedException {
        checkout.clickOnElement(cartPage.checkoutButton);
    }

    @Then("User should see first name input field")
    public void userShouldSeeFirstNameInputField() throws InterruptedException {
        softAssert.assertTrue(checkout.getDisplayStatus(checkout.firstName));
    }

    @And("First name field should be enabled")
    public void firstNameFieldShouldBeEnabled() throws InterruptedException{
        softAssert.assertTrue(checkout.getEnableStatus(checkout.firstName));
    }

    @And("Placeholder text {string} field should be visible on first name field")
    public void placeholderTextFieldShouldBeVisibleOnFirstNameField(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getAttributeValue(checkout.firstName,"placeholder"),arg0,"** Place holder text of first name mismatched");
    }

    @And("User should see last name input field")
    public void userShouldSeeLastNameInputField() throws InterruptedException {
        softAssert.assertTrue(checkout.getDisplayStatus(checkout.lastName));
    }

    @And("Last name field should be enabled")
    public void lastNameFieldShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout.getEnableStatus(checkout.lastName));
    }

    @And("Placeholder text {string} field should be visible on last name field")
    public void placeholderTextFieldShouldBeVisibleOnLastNameField(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getAttributeValue(checkout.lastName,"placeholder"),arg0,"** Place holder text of last name mismatched");
    }

    @And("User should see postal code input field")
    public void userShouldSeePostalCodeInputField() throws InterruptedException {
        softAssert.assertTrue(checkout.getDisplayStatus(checkout.postalCode));
    }

    @And("Postal code field should be enabled")
    public void postalCodeFieldShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout.getEnableStatus(checkout.postalCode));
    }

    @And("Placeholder text {string} field should be visible on postal code field")
    public void placeholderTextFieldShouldBeVisibleOnPostalCodeField(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getAttributeValue(checkout.postalCode,"placeholder"),arg0,"** Place holder text of postal code mismatched");
    }

    @And("User should see the continue button")
    public void userShouldSeeTheContinueButton() throws InterruptedException {
        softAssert.assertTrue(checkout.getDisplayStatus(checkout.continueButton), "continue button not visible");
    }

    @And("Continue button should be enabled")
    public void continueButtonShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout.getEnableStatus(checkout.continueButton));
    }

    @And("Continue button back-ground color should be {string}")
    public void continueButtonBackGroundColorShouldBe(String arg0) throws InterruptedException {
//        System.out.println("** button-color: " + checkout.getElementCssValue(checkout.continueButton,"background-color"));
        softAssert.assertEquals(checkout.getElementCssValue(checkout.continueButton,"background-color"),arg0);
    }

    @And("Continue button height should be {string}")
    public void continueButtonHeightShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getPropertyValue(checkout.continueButton,"scrollHeight"),arg0);
    }

    @And("Continue button width should be {string}")
    public void continueButtonWidthShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getPropertyValue(checkout.continueButton,"scrollWidth"),arg0);
    }

    @And("Continue button type should be {string}")
    public void continueButtonTypeShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getAttributeValue(checkout.continueButton,"type"),arg0);
    }

    @And("Continue button label should be {string}")
    public void continueButtonLabelShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getAttributeValue(checkout.continueButton,"value"),arg0);
    }

    @And("User should see the cancel button")
    public void userShouldSeeTheCancelButton() throws InterruptedException {
        softAssert.assertTrue(checkout.getDisplayStatus(checkout.cancelButton));
    }

    @And("Cancel button should be enabled")
    public void cancelButtonShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout.getEnableStatus(checkout.cancelButton));
    }

    @And("Cancel button back-ground color should be {string}")
    public void cancelButtonBackGroundColorShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getElementCssValue(checkout.cancelButton,"background-color"),arg0);
    }

    @And("Cancel button height should be {string}")
    public void cancelButtonHeightShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getPropertyValue(checkout.cancelButton,"scrollHeight"),arg0);
    }

    @And("Cancel button width should be {string}")
    public void cancelButtonWidthShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getPropertyValue(checkout.cancelButton,"scrollWidth"),arg0);
    }

    @And("Cancel button label should be {string}")
    public void cancelButtonLabelShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout.getPropertyValue(checkout.cancelButton,"textContent"),arg0);
    }
}
