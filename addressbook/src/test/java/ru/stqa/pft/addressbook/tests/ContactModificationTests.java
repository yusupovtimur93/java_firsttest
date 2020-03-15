package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactModificationTests extends TestBase {
   @Test
    public void testContactModification() {
       app.goTo().gotoHomePage();
       if (! app.goTo().isThereAcontact()) {
           app.getContactHelper().createContact (new ContactDate("firstname_1", "middle_1", "last_1", "012345678", "test1"), true);
       }
       app.goTo().gotoHomePage();
       app.goTo().editContact();
       app.getContactHelper().fillContactForm(new ContactDate("firstname_2", "middle_2", "last_2", "876543210",null), false);
       app.getContactHelper().updateContact();
       app.goTo().gotoHomePage();
    }
}
