package StepDefs;
import Pages.CartPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import java.util.List;
import static StepDefs.Hooks.softAssert;
import static Utilities.DriverSetup.getDriver;

public class CartPageDefs {
    CartPage cartPage = new CartPage();
    ProductPage productPage = new ProductPage();

    @When("User click on the cart")
    public void userClickOnTheCart() throws InterruptedException {
        cartPage.clickOnElement(productPage.cart);
    }

    @Then("User should see the list of products")
    public void userShouldSeeTheListOfProducts() throws InterruptedException {
        List<WebElement>productsItem = cartPage.getAllElements(cartPage.cartItemsRootLocator);
        softAssert.assertEquals(productsItem.size(),2,"total item number mismatch");
    }

    @Then("User should see {string} items in the cart badge")
    public void userShouldSeeItemsInTheCartBadge(String arg0) throws InterruptedException {
        softAssert.assertEquals(cartPage.getElementText(cartPage.cartBadge),arg0,"total item number mismatched");
    }

    @And ("User remove one item from cart")
    public void userRemoveOneItemFromCart() throws InterruptedException{
        List<WebElement>allItems = cartPage.getAllElements(cartPage.removeButton_css);
        System.out.println("** items : **" + allItems.size());
        if(!allItems.isEmpty()){
            allItems.get(0).click();
        }
        else{
            System.out.println("No elements found");
        }
    }

    @And("User click on continue shopping")
    public void userClickOnContinueShopping() throws InterruptedException{
        cartPage.clickOnElement(cartPage.continueShoppingButton);
    }
}
