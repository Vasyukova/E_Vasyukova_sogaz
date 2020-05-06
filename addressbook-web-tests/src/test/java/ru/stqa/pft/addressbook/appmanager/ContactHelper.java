package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.modeldata.ContData;

public class ContactHelper extends HelperBase
{
    public ContactHelper(ChromeDriver wd)
    {
        super(wd);
    }

    public void gotoContactGroup() {
        click(By.linkText("add new"));
    }


    public void contactCreation(ContData contData) {
        type(By.name("firstname"), contData.getFirstname());
        type(By.name("lastname"),contData.getLastname());
        type(By.name("address"),contData.getAdress());
        type(By.name("mobile"),contData.getMobilenumber());
        type(By.name("email"),contData.getEmailadress());
        type(By.name("bday"),contData.getBday());
        type(By.name("bmonth"),contData.getBmonth());
        type(By.name("byear"),contData.getByear());
    }


    public void submitCreationContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void gotoContactPage() {
        click(By.linkText("home page"));
    }


    public void modificationClass()
    {
        click(By.xpath("//img[@alt='Edit'])[1]"));
    }

    public void updateContactInfo()
    {
        click(By.xpath("(//input[@name='update'])[2]"));
    }
}
