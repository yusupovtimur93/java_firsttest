package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupDate;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void sumbitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupDate groupDate) {
        type(By.name("group_name"), groupDate.getName());
        type(By.name("group_header"), groupDate.getHeader());
        type(By.name("group_footer"), groupDate.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void sumbitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupDate group) {
        initGroupCreation();
        fillGroupForm(group);
        sumbitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereAgroup() {
        return isElementPresent(By.name("selected[]"));

    }
    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<GroupDate> getGroupList() {
        List<GroupDate> groups = new ArrayList<GroupDate>();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements) {
            String name = element.getText();
            GroupDate group = new GroupDate(name , null, null);
            groups.add(group);
        }
        return groups;
    }
}
