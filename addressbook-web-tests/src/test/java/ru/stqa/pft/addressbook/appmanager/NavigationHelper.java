package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.linkText;

public class NavigationHelper extends HelperBase
{
    public NavigationHelper(ChromeDriver wd)
    {
        super(wd);
    }

    public void goToCreateGroup()
    {
        click(linkText("groups"));
    }

    public void gotoHomePage()
    {
        click(linkText("home"));
    }
}
