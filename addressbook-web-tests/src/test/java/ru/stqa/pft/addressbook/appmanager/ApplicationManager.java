package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    ChromeDriver wd;
    private SessionHelper sessionHelper;
    private final NavigationHelper navigationHelper = new NavigationHelper();
    private ContactHelper contactHelper;
    private GroupHelper groupHelper;

    public void initial() {
        wd = new ChromeDriver();
        navigationHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void logout() {
        navigationHelper.wd.findElement(By.linkText("Logout")).click();
    }
    

    public void stop() {
        wd.findElement(By.linkText("Logout")).click();
        navigationHelper.wd.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            navigationHelper.wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            navigationHelper.wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper()
    {
        sessionHelper.login(username, password);
    }
}
