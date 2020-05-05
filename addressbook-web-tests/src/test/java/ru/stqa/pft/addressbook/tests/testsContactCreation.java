package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.modeldata.GroupContData;

public class testsContactCreation extends TestBase
{
    @Test
    public void testContact() throws Exception
    {
        appobj.ContactCreation(new GroupContData("Elena", "Vasyukova", "Korolev, Akademika Legostaeva", "89990006666", "Vasyukova.Elena@sogaz.ru", "29", "May", "1990"));
    }

}
