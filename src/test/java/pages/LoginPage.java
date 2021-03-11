package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public static final String URL = "https://alvan.my.salesforce.com/";
    public static final By USERNAME_INPUT = By.cssSelector("#username");
    public static final By PASSWORD_INPUT = By.cssSelector("#password");
    public static final By LOGIN_BUTTON = By.cssSelector("#Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    public LoginPage open(){
        driver.get(URL);
        return this;
    }

    public HomePage login(String userName, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}
