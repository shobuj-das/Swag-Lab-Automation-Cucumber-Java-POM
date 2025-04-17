package Pages;

import org.openqa.selenium.By;

public class Checkout extends BasePage{
    //  ----- input section -----
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By postalCode = By.id("postal-code");

    // ----- buttons -------
    public By continueButton = By.id("continue");
    public By cancelButton = By.id("cancel");


}
