package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver driver) {
        super(driver);


    }

    public void sumbitContactCreation() {
      click(By.name("submit"));
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

    public void updateContact() {
        click(By.name("update"));
    }

    public void selectGroupInContact() {
        click(By.name("new_group"));
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("test1");

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
}
