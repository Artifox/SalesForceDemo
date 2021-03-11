package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lookup { //TODO create base class ad move akk general parts to it
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(), '%s')]//ancestor::lightning-lookup//input";
    String dropdownOptionLocator = "//*[@title='%s']//ancestor::lightning-base-combobox-item";
    public Lookup(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String text){
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        driver.findElement(By.xpath(String.format(dropdownOptionLocator, text))).click();
    }
}
