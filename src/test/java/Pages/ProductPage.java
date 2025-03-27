package Pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public By cart = By.cssSelector(".shopping_cart_link");
    public By headerText = By.className("app_logo");
    public By menuBar = By.id("react-burger-menu-btn");
    public By productSort = By.className("product_sort_container");
    public By productPrice = By.className("inventory_item_price");
    public By addToCart = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory");
    public By remove = By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory");
    public By totalItemInCart = By.className("shopping_cart_badge");

}
