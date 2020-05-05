package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testsGroupCreation extends TestBase {

    @Test
    public void testGroupCreationTests() throws Exception {
        gotoCreateGroup();
        fillGroupInfo(new GroupData("testev1", "testev2", "testev3"));
        submitGroupCreation();
        gotoGroupPage();
    }


}
