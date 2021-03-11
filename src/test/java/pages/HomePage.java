package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public static final By CONTACTS_TAB = By.xpath("//one-app-nav-bar-item-root[@data-id='Contact']//descendant::span[contains(text(), 'Contacts')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        boolean isOpened;
        try{
            driver.findElement(CONTACTS_TAB);
            return  isOpened = true;
        }catch (NoSuchElementException exception){
            return isOpened = false;
        }
    }

    @Override
    public BasePage open() {
        return null;
    }

    public ContactsPage openContactsPage(){
        driver.findElement(CONTACTS_TAB).click();
        return new ContactsPage(driver);
    }
}
