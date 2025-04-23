package Pages;

import org.openqa.selenium.By;

public class Checkout_productInfo extends BasePage {
    // ---- messages
    public By checkoutMessage = By.xpath("//span[@class='title']");

    public By paymentInfo = By.xpath("//div[normalize-space()='Payment Information:']");
    public By prices = By.xpath("//div[@class='inventory_item_price']");
    public By shippingInfo = By.xpath("//div[normalize-space()='Shipping Information:']");
    public By itemTotalPrice =  By.xpath("//div[@class='summary_subtotal_label']");
    public By tax = By.xpath("//div[@class='summary_tax_label']");
    public By totalPrice = By.xpath("//div[@class='summary_total_label']");


    // ------ buttons
    public By finish = By.id("finish");
    public By cancel = By.id("cancel");

}
