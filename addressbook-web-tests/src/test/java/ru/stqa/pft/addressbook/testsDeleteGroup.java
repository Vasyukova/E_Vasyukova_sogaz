package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class testsDeleteGroup extends TestBase
{
  @Test
  public void testsDeleteGroup() throws Exception
  {
    goToGroups();
    selectGroup();
    deleteSelectedGroups();
    gotoGroupPage();
  }

}
