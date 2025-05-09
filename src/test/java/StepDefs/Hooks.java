package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static Utilities.DriverSetup.closeBrowser;
import static Utilities.DriverSetup.openABrowser;

public class Hooks {
    public static String browserName = System.getProperty("browser", "Chrome");
    public static SoftAssert softAssert;

    @Before
    public static void beforeScenario() throws InterruptedException {
        openABrowser(browserName);
        softAssert = new SoftAssert();
    }


    @After
    public static void afterScenario() throws InterruptedException {
        try {
            softAssert.assertAll(); // Ensure all soft assertions are checked
        } catch (AssertionError e) {
            System.out.println("Soft assertions failed: " + e.getMessage());
            Assert.fail(e.getMessage()); // This makes Allure mark the test as failed
        }
        finally {
            closeBrowser();
        }
    }
}
