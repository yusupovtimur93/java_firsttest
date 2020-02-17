package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAgroup()) {
            app.getGroupHelper().createGroup (new  GroupDate("test1", null, null));

        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupDate("test1", null, null));
        app.getGroupHelper().sumbitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}
