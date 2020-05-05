package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class testsDeleteGroup extends TestBase
{
  @Test
  public void testsDeleteGroup() throws Exception
  {
    appobj.goToGroups();
    appobj.selectGroup();
    appobj.deleteSelectedGroups();
    appobj.gotoGroupPage();
  }

}
