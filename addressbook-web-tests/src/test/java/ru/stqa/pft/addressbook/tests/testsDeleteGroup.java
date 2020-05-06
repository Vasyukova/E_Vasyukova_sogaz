package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class testsDeleteGroup extends TestBase
{
  @Test
  public void testsDeleteGroup() throws Exception
  {
    appobj.getNavigationHelper().goToGroupPage();
    appobj.getGroupHelper().selectGroup();
    appobj.getGroupHelper().deleteSelectedGroups();
    appobj.getGroupHelper().gotoGroupPage();
  }

}
