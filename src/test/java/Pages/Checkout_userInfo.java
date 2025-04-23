package Pages;

import org.openqa.selenium.By;

public class Checkout_userInfo extends BasePage{
    //  ----- input section -----
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By postalCode = By.id("postal-code");

    // ----- buttons -------
    public By continueButton = By.id("continue");
    public By cancelButton = By.id("cancel");

    // ----------- messages
    public By pageHeader = By.className("app_logo");
    public By checkoutMessage = By.xpath("//span[@class='title']");

    // -------- error
    public By errorMessage = By.xpath("//h3[@data-test='error']");
    public By errorMgsCloseButton = By.xpath("//button[@class='error-button']");

}
