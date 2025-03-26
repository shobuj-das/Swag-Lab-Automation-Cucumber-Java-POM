package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    BasePage basePage = new BasePage();
    public String login_url = "https://www.saucedemo.com/";
    public By username = By.cssSelector("#user-name");
    public By password = By.cssSelector("#password");
    public By loginButton = By.cssSelector("#login-button");
    public By errorButton = By.cssSelector(".error-button");
    public By errorMessage = By.xpath("//h3[@data-test='error']");


}
