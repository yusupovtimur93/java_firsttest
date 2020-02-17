package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver driver) {
        super(driver);


    }

    public void sumbitContactCreation() {
      click(By.name("submit"));
    }

    public void fillContactForm(ContactDate contactDate, boolean creation) {
        type(By.name("firstname"),contactDate.getFirtname());
        type(By.name("middlename"),contactDate.getMiddlename());
        type(By.name("lastname"),contactDate.getLastname());
        type(By.name("home"),contactDate.getHomephone());
//        type(By.name("nickname"),contactDate.getHomephone());
//        type(By.name("title"),contactDate.getHomephone());
//        type(By.name("company"),contactDate.getHomephone());
//        type(By.name("address"),contactDate.getHomephone());
//        type(By.name("mobile"),contactDate.getHomephone());
//        type(By.name("work"),contactDate.getHomephone());
//        type(By.name("fax"),contactDate.getHomephone());
//        type(By.name("email"),contactDate.getHomephone());
//        type(By.name("email2"),contactDate.getHomephone());
//        type(By.name("email3"),contactDate.getHomephone());
//        type(By.name("homepage"),contactDate.getHomephone());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactDate.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void initContactCreation() {
      driver.findElement(By.linkText("add new")).click();
    }

    public void updateContact() {
        click(By.name("update"));
    }



    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContactButton() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void deleteAprove() {
        driver.switchTo().alert().accept();
    }

    public void createContact(ContactDate contact, boolean b) {

        initContactCreation();
        fillContactForm(contact, b);
        sumbitContactCreation();
    }

    public boolean isThereAcontact() {
        return isElementPresent(By.name("selected[]"));
    }
}
