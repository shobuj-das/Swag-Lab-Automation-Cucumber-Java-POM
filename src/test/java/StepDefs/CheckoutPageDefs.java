package StepDefs;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static StepDefs.Hooks.softAssert;
import static Utilities.DriverSetup.getDriver;

public class CheckoutPageDefs {
    BasePage basePage = new BasePage();
    Checkout_userInfo checkout_userInfo = new Checkout_userInfo();
    Checkout_productInfo checkout_productInfo = new Checkout_productInfo();
    Checkout_complete checkoutComplete = new Checkout_complete();
    CartPage cartPage = new CartPage();

    @And("User click on the checkout button")
    public void userClickOnTheCheckoutButton() throws InterruptedException {
        checkout_userInfo.clickOnElement(cartPage.checkoutButton);
    }

    @Then("User should see first name input field")
    public void userShouldSeeFirstNameInputField() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getDisplayStatus(checkout_userInfo.firstName));
    }

    @And("First name field should be enabled")
    public void firstNameFieldShouldBeEnabled() throws InterruptedException{
        softAssert.assertTrue(checkout_userInfo.getEnableStatus(checkout_userInfo.firstName));
    }

    @And("Placeholder text {string} field should be visible on first name field")
    public void placeholderTextFieldShouldBeVisibleOnFirstNameField(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getAttributeValue(checkout_userInfo.firstName,"placeholder"),arg0,"** Place holder text of first name mismatched");
    }

    @And("User should see last name input field")
    public void userShouldSeeLastNameInputField() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getDisplayStatus(checkout_userInfo.lastName));
    }

    @And("Last name field should be enabled")
    public void lastNameFieldShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getEnableStatus(checkout_userInfo.lastName));
    }

    @And("Placeholder text {string} field should be visible on last name field")
    public void placeholderTextFieldShouldBeVisibleOnLastNameField(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getAttributeValue(checkout_userInfo.lastName,"placeholder"),arg0,"** Place holder text of last name mismatched");
    }

    @And("User should see postal code input field")
    public void userShouldSeePostalCodeInputField() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getDisplayStatus(checkout_userInfo.postalCode));
    }

    @And("Postal code field should be enabled")
    public void postalCodeFieldShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getEnableStatus(checkout_userInfo.postalCode));
    }

    @And("Placeholder text {string} field should be visible on postal code field")
    public void placeholderTextFieldShouldBeVisibleOnPostalCodeField(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getAttributeValue(checkout_userInfo.postalCode,"placeholder"),arg0,"** Place holder text of postal code mismatched");
    }

    @And("User should see the continue button")
    public void userShouldSeeTheContinueButton() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getDisplayStatus(checkout_userInfo.continueButton), "continue button not visible");
    }

    @And("Continue button should be enabled")
    public void continueButtonShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getEnableStatus(checkout_userInfo.continueButton));
    }

    @And("Continue button back-ground color should be {string}")
    public void continueButtonBackGroundColorShouldBe(String arg0) throws InterruptedException {
//        System.out.println("** button-color: " + checkout.getElementCssValue(checkout.continueButton,"background-color"));
        softAssert.assertEquals(checkout_userInfo.getElementCssValue(checkout_userInfo.continueButton,"background-color"),arg0);
    }

    @And("Continue button height should be {string}")
    public void continueButtonHeightShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getPropertyValue(checkout_userInfo.continueButton,"scrollHeight"),arg0);
    }

    @And("Continue button width should be {string}")
    public void continueButtonWidthShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getPropertyValue(checkout_userInfo.continueButton,"scrollWidth"),arg0);
    }

    @And("Continue button type should be {string}")
    public void continueButtonTypeShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getAttributeValue(checkout_userInfo.continueButton,"type"),arg0);
    }

    @And("Continue button label should be {string}")
    public void continueButtonLabelShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getAttributeValue(checkout_userInfo.continueButton,"value"),arg0);
    }

    @And("User should see the cancel button")
    public void userShouldSeeTheCancelButton() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getDisplayStatus(checkout_userInfo.cancelButton));
    }

    @And("Cancel button should be enabled")
    public void cancelButtonShouldBeEnabled() throws InterruptedException {
        softAssert.assertTrue(checkout_userInfo.getEnableStatus(checkout_userInfo.cancelButton));
    }

    @And("Cancel button back-ground color should be {string}")
    public void cancelButtonBackGroundColorShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getElementCssValue(checkout_userInfo.cancelButton,"background-color"),arg0);
    }

    @And("Cancel button height should be {string}")
    public void cancelButtonHeightShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getPropertyValue(checkout_userInfo.cancelButton,"scrollHeight"),arg0);
    }

    @And("Cancel button width should be {string}")
    public void cancelButtonWidthShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getPropertyValue(checkout_userInfo.cancelButton,"scrollWidth"),arg0);
    }

    @And("Cancel button label should be {string}")
    public void cancelButtonLabelShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(checkout_userInfo.getPropertyValue(checkout_userInfo.cancelButton,"textContent"),arg0);
    }

    @And("User enter {string} on the last name field")
    public void userEnterOnTheLastNameField(String arg0) throws InterruptedException{
        basePage.writeOnElement(checkout_userInfo.lastName,arg0);
    }

    @And("User enter {string} on the postal code field")
    public void userEnterOnThePostalCodeField(String arg0) throws InterruptedException {
        basePage.writeOnElement(checkout_userInfo.postalCode,arg0);
    }

    @And("User click on the continue button in step one")
    public void userClickOnTheContinueButtonInStepOne() throws InterruptedException {
        basePage.clickOnElement(checkout_userInfo.continueButton);
    }

    @Then("User should see the {string} error message")
    public void userShouldSeeTheErrorMessage(String arg0) throws InterruptedException{
        softAssert.assertEquals(basePage.getElementText(checkout_userInfo.errorMessage),arg0, "** error mgs mismatched");
    }

    @And("User click on the error message close button")
    public void userClickOnTheErrorMessageCloseButton() throws InterruptedException{
        basePage.clickOnElement(checkout_userInfo.errorMgsCloseButton);
    }

    @Then("Error message should be invisible")
    public void errorMessageShouldBeInvisible() {
        softAssert.assertTrue(basePage.getElementInvisibilityStatus(checkout_userInfo.checkoutMessage));
    }

    @And("User enter {string} on the first name field")
    public void userEnterOnTheFirstNameField(String arg0) throws InterruptedException {
        basePage.writeOnElement(checkout_userInfo.firstName,arg0);
    }

    @And("User remove last name")
    public void userRemoveLastName() {
        basePage.clearInputText(checkout_userInfo.lastName);
    }

    @And("User remove postal code")
    public void userRemovePostalCode() {
        basePage.clearInputText(checkout_userInfo.postalCode);
    }

    @And("wait for a while")
    public void waitForAWhile() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Then("User should be on the checkout step two page")
    public void userShouldBeOnTheCheckoutStepTwoPage() {
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
    }

    @And("User click on the cancel button on step two")
    public void userClickOnTheCancelButtonOnStepTwo() throws InterruptedException {
        basePage.clickOnElement(checkout_productInfo.cancel);
    }

    @Then("User should be on the product page")
    public void userShouldBeOnTheProductPage() {
        softAssert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }

    @And("User click on the cancel button in step one")
    public void userClickOnTheCancelButtonInStepOne() throws InterruptedException {
        basePage.clickOnElement(checkout_userInfo.cancelButton);
    }

    @Then("User should on the cart page")
    public void userShouldOnTheCartPage() {
        softAssert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/cart.html");
    }

//    @Then("User should see all products")
//    public void userShouldSeeAllProducts() {
//
//    }

    @And("User should see payment information")
    public void userShouldSeePaymentInformation() throws InterruptedException {
        softAssert.assertTrue(basePage.getDisplayStatus(checkout_productInfo.paymentInfo));
    }

    @And("User should see shipping information")
    public void userShouldSeeShippingInformation() throws InterruptedException {
        softAssert.assertTrue(basePage.getDisplayStatus(checkout_productInfo.shippingInfo));
    }

    @And("User should see item total price")
    public void userShouldSeeItemTotalPrice() throws InterruptedException {
        softAssert.assertTrue(basePage.getDisplayStatus(checkout_productInfo.itemTotalPrice));
    }

    @And("User should see total tax")
    public void userShouldSeeTotalTax() throws InterruptedException {
        softAssert.assertTrue(basePage.getDisplayStatus(checkout_productInfo.tax));
    }

    @And("User should see total price")
    public void userShouldSeeTotalPrice() throws InterruptedException {
        softAssert.assertTrue(basePage.getDisplayStatus(checkout_productInfo.totalPrice));
    }

    @And("User click on the Finish button")
    public void userClickOnTheFinishButton() throws InterruptedException {
        basePage.clickOnElement(checkout_productInfo.finish);
    }

    @Then("User see the checkout complete message")
    public void userSeeTheCheckoutCompleteMessage() throws InterruptedException {
        softAssert.assertEquals(basePage.getElementText(checkoutComplete.checkoutMessage),"Checkout: Complete!", "** checkout complete message not matched");
    }

    @And("User see the Back home button")
    public void userSeeTheBackHomeButton() throws InterruptedException {
        softAssert.assertTrue(basePage.getDisplayStatus(checkoutComplete.backHomeButton), "** back home button not displayed");
    }

    @And("User see the welcome message on the screen")
    public void userSeeTheWelcomeMessageOnTheScreen() throws InterruptedException {
        softAssert.assertEquals(basePage.getElementText(checkoutComplete.thanksMessage),"Thank you for your order!", "** thanks message mismatched");
    }
}
