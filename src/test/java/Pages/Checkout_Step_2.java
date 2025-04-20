package Pages;

import org.openqa.selenium.By;

public class Checkout_Step_2 extends BasePage {
    // ---- messages
    public By checkoutMessage = By.xpath("//span[@class='title']");

    public By prices = By.xpath("//div[@class='inventory_item_price']");
    public By itemTotalPrice =  By.xpath("//div[@class='summary_subtotal_label']");
    public By tax = By.xpath("//div[@class='summary_tax_label']");
    public By totalPrice = By.xpath("//div[@class='summary_total_label']");


    // ------ buttons
    public By finish = By.id("finish");
    public By cancel = By.id("cancel");

}
