package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper
{

    private ChromeDriver wd;

    public SessionHelper(ChromeDriver wd)
    {

        this.wd = wd;
    }
}
