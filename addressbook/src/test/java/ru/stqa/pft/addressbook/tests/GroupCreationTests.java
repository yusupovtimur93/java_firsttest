package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupDate("test1", "test2", "test3"));
        app.sumbitGroupCreation();
        app.returnToGroupPage();
    }

}
