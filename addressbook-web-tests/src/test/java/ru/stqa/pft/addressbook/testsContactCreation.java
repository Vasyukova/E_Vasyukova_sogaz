package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class testsContactCreation extends TestBase
{
    @Test
    public void testContact() throws Exception
    {
        ContactCreation(new GroupContData("Elena", "Vasyukova", "Korolev, Akademika Legostaeva", "89990006666", "Vasyukova.Elena@sogaz.ru", "29", "May", "1990"));
    }

}
