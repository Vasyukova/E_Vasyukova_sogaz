package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.modeldata.GroupContData;

public class ContactHelper
{
    public WebDriver wd;
    public ContactHelper(WebDriver wd)
    {
        this.wd = wd;
    }

    public void gotoContactGroup() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void contactCreation(GroupContData groupContData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(groupContData.getFirstname());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(groupContData.getLastname());
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(groupContData.getAdress());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(groupContData.getEmailadress());
        wd.findElement(By.name("bday")).click();
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(groupContData.getBday());
        wd.findElement(By.name("bday")).click();
        wd.findElement(By.name("bmonth")).click();
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(groupContData.getBmonth());
        wd.findElement(By.name("bmonth")).click();
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(groupContData.getByear());
        wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void submitCreationContact() {
        wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void gotoContactPage() {
        wd.findElement(By.linkText("home page")).click();
    }


}
