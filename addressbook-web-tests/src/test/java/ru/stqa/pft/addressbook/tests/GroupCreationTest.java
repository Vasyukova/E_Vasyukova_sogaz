package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modeldata.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        appobj.getGroupHelper().gotoCreateGroup();
        appobj.getGroupHelper().fillGroupInfo(new GroupData("testev1", "testev2", "testev3"));
        appobj.getGroupHelper().submitGroupCreation();
        appobj.getGroupHelper().gotoGroupPage();
    }


}
