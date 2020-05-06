package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.modeldata.ContData;

public class TestsContactCreation extends TestBase{

    @Test
    public void testContact() throws Exception
    {
        appobj.getContactHelper().gotoContactGroup();
        appobj.getContactHelper().contactCreation(new ContData("Elena", "Vasyukova", "Korolev, Akademika Legostaeva", "89990006666", "Vasyukova.Elena@sogaz.ru", "29", "May", "1990"));
        appobj.getContactHelper().submitCreationContact();
        appobj.getContactHelper().gotoContactPage();
    }
}

