package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modeldata.ContData;

public class ContactModificationTest extends TestBase
{
    @Test
    public void testContactModification()
    {
        appobj.getNavigationHelper().gotoHomePage();
        appobj.getContactHelper().modificationClass();
        appobj.getContactHelper().contactCreation(new ContData("Elena", "Vasyukova666", "Test1", "89990006666", "Vasyukova.Elena@sogaz.ru", "29", "May", "1990"));
        appobj.getContactHelper().updateContactInfo();
    }
}
