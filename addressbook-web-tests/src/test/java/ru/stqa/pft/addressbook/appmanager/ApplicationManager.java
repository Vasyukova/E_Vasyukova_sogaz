package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private final NavigationHelper navigationHelper = new NavigationHelper();
    private ContactHelper contactHelper;
    private GroupHelper groupHelper;

    public void initial() {
        navigationHelper.wd = new ChromeDriver();
        navigationHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        gotoAddressbook();
        groupHelper = new GroupHelper(navigationHelper.wd);
        contactHelper = new ContactHelper(navigationHelper.wd);
        login("admin", "secret");
    }

    public void logout() {
        navigationHelper.wd.findElement(By.linkText("Logout")).click();
    }

    public void login(String login, String password) {
        navigationHelper.wd.findElement(By.name("user")).clear();
        navigationHelper.wd.findElement(By.name("user")).sendKeys(login);
        navigationHelper.wd.findElement(By.name("pass")).clear();
        navigationHelper.wd.findElement(By.name("pass")).sendKeys(password);
        navigationHelper.wd.findElement(By.id("LoginForm")).submit();
    }

    private void gotoAddressbook()
    {
        navigationHelper.wd.get("http://localhost/addressbook/group.php");
    }

    public void stop() {
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
}
