package StepDefs;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static StepDefs.Hooks.softAssert;
import static Utilities.DriverSetup.getDriver;

public class LoginPageDefs {
    LoginPage loginPage = new LoginPage();

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
}
