package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper
{
    WebDriver wd;

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
