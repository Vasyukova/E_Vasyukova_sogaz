package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class DeleteGroupTest extends TestBase
{
  @Test
  public void testsDeleteGroup() throws Exception
  {
    appobj.getGroupHelper().returnToGroupPage();
    appobj.getGroupHelper().selectGroup();
    appobj.getGroupHelper().deleteSelectedGroups();
    appobj.getGroupHelper().gotoGroupPage();
  }

}
