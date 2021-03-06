package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;
import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().GroupPage();
        if (app.Group().List().size() == 0) {
            app.Group().create(new  GroupDate().withName("test1"));
        }
    }
    @Test
    public void testGroupModification() {
        List<GroupDate> before = app.Group().List();
        int index = before.size() - 1;
        GroupDate group = new GroupDate()
                .withId(before.get(index).getId()).withName("test1").withHeader("test2").withFooter("test3");
        app.Group().modify(index, group);
        List<GroupDate> after = app.Group().List();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(group);
        Comparator<? super GroupDate> byId = Comparator.comparingInt(GroupDate::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);
    }


}
