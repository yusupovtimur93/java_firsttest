package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactCreationTests extends TestBase{
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();


  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().createContact(new ContactDate("firstname_1", "middle_1", "last_1", "012345678", "test1"), true);

    app.getNavigationHelper().gotoHomePage();
  }


}

