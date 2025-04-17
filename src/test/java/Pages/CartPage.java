package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage{
    // -- cart
    public By cartLink = By.className("shopping_cart_link");
    public By cartBadge= By.className("shopping_cart_badge");

    // ------- products
    public By cartItemsRootLocator = By.className("cart_item_label");
    public By productName = By.className("inventory_item_name");
    public By productDescription = By.className("inventory_item_desc");
    public By productPrice = By.className("inventory-item-price");
    public By removeButton = By.cssSelector(".btn.btn_secondary.btn_small.cart_button");

    public By continueShoppingButton = By.cssSelector("#continue-shopping");
    public By checkoutButton = By.cssSelector("#checkout");

    public By menuBar = By.id("react-burger-menu-btn");
    public By allItems = By.id("inventory_sidebar_link");



    // ----------------- Functions ---------------------
    public void removeItemFromCart() throws InterruptedException {
        List<WebElement> allItems = getAllElements(removeButton);
        System.out.println("** items : " + allItems.size());
        if(!allItems.isEmpty()){
            allItems.get(0).click();
        }
        else{
            System.out.println("No elements found");
        }
    }
}
