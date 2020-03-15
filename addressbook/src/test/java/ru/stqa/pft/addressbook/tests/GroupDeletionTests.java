package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.List;

public class GroupDeletionTests extends TestBase{

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().GroupPage();
    if (app.Group().List().size() == 0) {
      app.Group().create(new  GroupDate().withName("test1"));
    }
  }

  @Test
  public void testGroupDeletion() throws Exception {
    List<GroupDate> before = app.Group().List();
    int index = before.size() - 1;
    app.Group().delete(index);
    List<GroupDate> after = app.Group().List();
     Assert.assertEquals(after.size(), before.size() - 1);

     before.remove(index);
     Assert.assertEquals(before,after);
  }




}
