package Pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public By cart = By.cssSelector(".shopping_cart_link");
    public By headerText = By.className("app_logo");
    public By menuBar = By.id("react-burger-menu-btn");
    public By productSort = By.className("product_sort_container");

}
