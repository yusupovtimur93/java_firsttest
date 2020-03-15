package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() {
        app.goTo().gotoHomePage();
        if (! app.getContactHelper().isThereAcontact()) {
            app.getContactHelper().createContact (new ContactDate("firstname_1", "middle_1", "last_1", "012345678", "test1"), true);
        }
        app.goTo().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactButton();
        app.getContactHelper().deleteAprove();

    }
}
