package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactModificationTests extends TestBase {
   @Test
    public void testContactModification() {
       app.getNavigationHelper().gotoHomePage();
       app.getNavigationHelper().editContact();
       app.getContactHelper().fillContactForm(new ContactDate("firstname_2", "middle_2", "last_2", "876543210"));
       app.getContactHelper().updateContact();
       app.getNavigationHelper().gotoHomePage();
    }
}
