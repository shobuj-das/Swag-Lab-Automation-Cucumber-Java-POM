package Pages;

import org.openqa.selenium.By;

public class Checkout_complete extends BasePage {
    // ------- messages
    public By checkoutMessage = By.xpath("//span[@class='title']");
    public By thanksMessage = By.xpath("//h2[normalize-space()='Thank you for your order!']");
    public By deliveryMessage = By.xpath("//div[@class='complete-text']");

    // --- buttons
    public By backHomeButton = By.id("back-to-products");

}
