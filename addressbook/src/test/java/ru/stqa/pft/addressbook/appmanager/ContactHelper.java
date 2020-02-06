package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver driver) {
        super(driver);


    }

    public void sumbitContactCreation() {
      driver.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactDate contactDate) {
        type(By.name("firstname"),contactDate.getFirtname());
        type(By.name("middlename"),contactDate.getMiddlename());
        type(By.name("lastname"),contactDate.getLastname());
        type(By.name("home"),contactDate.getHomephone());
    }

    public void initContactCreation() {
      driver.findElement(By.linkText("add new")).click();
    }
}
