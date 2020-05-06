package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modeldata.GroupData;

public class GroupModificationTest extends TestBase
{
    @Test
    public void testsModificationGroup()
    {
        appobj.getGroupHelper().returnToGroupPage();
        appobj.getGroupHelper().selectGroup();
        appobj.getGroupHelper().initGroupModification();
        appobj.getGroupHelper().fillGroupInfo(new GroupData("testev4", "testev5", "testev6"));
        appobj.getGroupHelper().submitGroupModification();
        appobj.getGroupHelper().gotoGroupPage();
    }
}
