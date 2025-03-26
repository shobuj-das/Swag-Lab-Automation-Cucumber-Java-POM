package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends BasePage{
    BasePage basePage = new BasePage();
    public String login_url = "https://www.saucedemo.com/";
    public By email = By.cssSelector("#password");

}
