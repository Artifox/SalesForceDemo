package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(), '%s')]//ancestor::lightning-picklist//input";
    String dropdownOptionLocator = "//*[@title='%s']//ancestor::lightning-base-combobox-item";

    public Dropdown(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String text){
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(dropdownOptionLocator, text))).click();
    }
}
