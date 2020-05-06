package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.modeldata.GroupData;

public class testsGroupCreation extends TestBase {

    @Test
    public void testGroupCreationTests() throws Exception {
        appobj.getGroupHelper().gotoCreateGroup();
        appobj.getGroupHelper().fillGroupInfo(new GroupData("testev1", "testev2", "testev3"));
        appobj.getGroupHelper().submitGroupCreation();
        appobj.getGroupHelper().gotoGroupPage();
    }


}
