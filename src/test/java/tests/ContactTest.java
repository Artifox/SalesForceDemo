package tests;

import models.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    String login = "salesako-kjxv@force.com";
    String password = "#@$%5f~eT&Ne$4ZZ";
    String URL = "https://alvan.lightning.force.com/";

    @Test
    public void contactShouldBeCreated() {
        Contact contact = new Contact("Mr.", "Artsiom", "Koptsiukh", "ajo",
                "Senior", "+375235433234", "+375754493658","ako@mail.com",
                "Street 18", "Minsk", "State", "666666", "Belarus", "Other Street",
                "Other City", "Other State", "555555", "Other Country", "Fax", "375445673341", "765996538459",
                "964775598345", "John", "IT", "Advertisement", "Description");
        loginPage
                .open()
                .login(login, password);
        Assert.assertTrue(homePage.isOpened(), "Home page is not opened");
        contactsPage
                .open()
                .openNewContactPopUp()
                .createContact(contact);
    }
}

