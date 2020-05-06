package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper
{
    public ChromeDriver wd;

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
