package pages;

import elements.Dropdown;
import elements.TextArea;
import models.Contact;
import org.openqa.selenium.WebDriver;
import elements.Input;
import elements.Lookup;

public class ContactsPage extends BasePage{

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return false;
    }

    @Override
    public ContactsPage open() {
        driver.get("https://alvan.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        return this;
    }

    public ContactsPage openNewContactPopUp(){
        driver.get("https://alvan.lightning.force.com/lightning/o/Contact/new?count=3&nooverride=1&useRecordTypeCheck=1&navigationLocation=MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent");
        return this;
    }

    public void createContact(Contact contact){
        new Dropdown(driver, "Salutation").selectOption(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Lookup(driver, "Account Name").selectOption(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State/Province").write(contact.getOtherState());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZipCode());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new Dropdown(driver, "Lead Source").selectOption(contact.getLeadSource());
        new TextArea(driver, "Description").write(contact.getDescription());
        //new Lookup(driver, "Reports To").selectOption(reportTo);
    }
}
