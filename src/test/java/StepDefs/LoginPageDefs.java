package StepDefs;

import Pages.LoginPage;
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

    @Then("user see email field")
    public void userSeeEmailField() throws InterruptedException {
        softAssert.assertTrue(loginPage.getDisplayStatus(loginPage.email));
    }
}
