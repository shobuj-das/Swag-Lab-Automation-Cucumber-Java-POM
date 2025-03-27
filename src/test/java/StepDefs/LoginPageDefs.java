package StepDefs;

import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.testng.asserts.SoftAssert;

import static StepDefs.Hooks.softAssert;
import static Utilities.DriverSetup.getDriver;

public class LoginPageDefs {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Given("User on the login page")
    public void userOnTheLoginPage() {
        getDriver().get(loginPage.login_url);
    }

    @Then("Username field should present")
    public void usernameFieldShouldPresent() throws InterruptedException {
        softAssert.assertTrue(loginPage.getDisplayStatus(loginPage.username));
    }

    @And("Username placeholder should be {string}")
    public void usernamePlaceholderShouldBe(String arg0) throws InterruptedException{
        softAssert.assertEquals(loginPage.getAttributeValue(loginPage.username,"placeholder"),arg0, "Username placeholder doesn't match");
    }

    @And("Username field should be writable")
    public void usernameFieldShouldBeWritable() throws InterruptedException {
        boolean enableStatus = loginPage.getEnableStatus(loginPage.username);
        softAssert.assertTrue(enableStatus,"Username field is not enabled");

        String readOnly = loginPage.getPropertyValue(loginPage.username,"readOnly");
        softAssert.assertEquals(readOnly,"false", "Username field is read only");
    }

    @And("Password field should present")
    public void passwordFieldShouldPresent() throws InterruptedException {
        softAssert.assertTrue(loginPage.getDisplayStatus(loginPage.password), "Password field is not displayed");
    }

    @And("Password field placeholder should be {string}")
    public void passwordFieldPlaceholderShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(loginPage.getAttributeValue(loginPage.password,"placeholder"),arg0, "Password field placeholder doesn't match");
    }

    @And("Password field should be writable")
    public void passwordFieldShouldBeWritable() throws InterruptedException {
        boolean enableStatus = loginPage.getEnableStatus(loginPage.password);
        softAssert.assertTrue(enableStatus,"password field is not enabled");

        String readOnly = loginPage.getPropertyValue(loginPage.password,"readOnly");
        softAssert.assertEquals(readOnly,"false", "password field is read only");
    }

    @And("Login button should present")
    public void loginButtonShouldPresent() throws InterruptedException {
        softAssert.assertTrue(loginPage.getDisplayStatus(loginPage.loginButton),"Login button is not displayed");
    }

    @Then("Login button label should be {string}")
    public void loginButtonLabelShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(loginPage.getPropertyValue(loginPage.loginButton,"value"),arg0,"Login button label doesn't match");
    }

    @And("Login button color should be {string}")
    public void loginButtonColorShouldBe(String arg0) throws InterruptedException {
        softAssert.assertEquals(loginPage.getElementCssValue(loginPage.loginButton,"background-color"),arg0,"Login button color doesn't matched");
    }

    @And("Login button height should be {string}")
    public void loginButtonHeightShouldBe(String arg0) throws InterruptedException {
        Dimension dimension = loginPage.getDimension(loginPage.loginButton);
        String height = Integer.toString(dimension.getHeight());
        softAssert.assertEquals(height,arg0,"Login button height doesn't matched");
    }

    @And("Login button width should be {string}")
    public void loginButtonWidthShouldBe(String arg0) throws InterruptedException{
        Dimension dimension = loginPage.getDimension(loginPage.loginButton);
        String width = Integer.toString(dimension.getWidth());
        softAssert.assertEquals(width,arg0,"Login button width doesn't matched");
    }

    @And("Login button type is {string}")
    public void loginButtonTypeIs(String arg0) throws InterruptedException{
        softAssert.assertEquals(loginPage.getAttributeValue(loginPage.loginButton,"type"),arg0,"Login button type mismatched");
    }

    @When("User enter {string} in the username field")
    public void userEnterInTheUsernameField(String arg0) throws InterruptedException{
        loginPage.writeOnElement(loginPage.username,arg0);
    }

    @And("User enter {string} in the password field")
    public void userEnterInThePasswordFiled(String arg0) throws InterruptedException {
        loginPage.writeOnElement(loginPage.password,arg0);
    }

    @Then("Page url should be {string}")
    public void pageUrlShouldBe(String arg0) {
        softAssert.assertEquals(getDriver().getCurrentUrl(),arg0,"Page url doesn't match");
    }

    @And("User should see the cart on the page")
    public void userShouldSeeTheCartOnThePage() throws InterruptedException {
        softAssert.assertTrue(loginPage.getDisplayStatus(productPage.cart),"Cart doesn't display");
    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() throws InterruptedException {
        loginPage.clickOnElement(loginPage.loginButton);
    }

    @Then("User should see the {} in the login page")
    public void userShouldSeeTheInTheLoginPage(String arg0) throws InterruptedException{
        softAssert.assertEquals(loginPage.getElementText(loginPage.errorMessage),arg0,"Error message doesn't match");
    }
}
