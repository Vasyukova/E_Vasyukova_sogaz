package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class TestsDeleteGroup extends TestBase
{
  @Test
  public void testsDeleteGroup() throws Exception
  {
    appobj.getNavigationHelper().goToCreateGroup();
    appobj.getGroupHelper().selectGroup();
    appobj.getGroupHelper().deleteSelectedGroups();
    appobj.getGroupHelper().gotoGroupPage();
  }

}
