package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.modeldata.GroupContData;

import java.util.concurrent.TimeUnit;

public class ApllicationManager {

    private final NavigationHelper navigationHelper = new NavigationHelper();
    private GroupHelper groupHelper;

    public void initial() {
        navigationHelper.wd = new ChromeDriver();
        navigationHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        gotoAddressbook();
        groupHelper = new GroupHelper(navigationHelper.wd);
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

    public void ContactCreation(GroupContData groupContData) {
        groupHelper.wd.findElement(By.linkText("add new")).click();
        groupHelper.wd.findElement(By.name("firstname")).click();
        groupHelper.wd.findElement(By.name("firstname")).clear();
        groupHelper.wd.findElement(By.name("firstname")).sendKeys(groupContData.getFirstname());
        groupHelper.wd.findElement(By.name("lastname")).click();
        groupHelper.wd.findElement(By.name("lastname")).clear();
        groupHelper.wd.findElement(By.name("lastname")).sendKeys(groupContData.getLastname());
        groupHelper.wd.findElement(By.name("address")).click();
        groupHelper.wd.findElement(By.name("address")).clear();
        groupHelper.wd.findElement(By.name("address")).sendKeys(groupContData.getAdress());
        groupHelper.wd.findElement(By.name("mobile")).click();
        groupHelper.wd.findElement(By.name("mobile")).clear();
        groupHelper.wd.findElement(By.name("mobile")).sendKeys(groupContData.getMobilenumber());
        groupHelper.wd.findElement(By.name("email")).click();
        groupHelper.wd.findElement(By.name("email")).clear();
        groupHelper.wd.findElement(By.name("email")).sendKeys(groupContData.getEmailadress());
        groupHelper.wd.findElement(By.name("bday")).click();
        new Select(groupHelper.wd.findElement(By.name("bday"))).selectByVisibleText(groupContData.getBday());
        groupHelper.wd.findElement(By.name("bday")).click();
        groupHelper.wd.findElement(By.name("bmonth")).click();
        new Select(groupHelper.wd.findElement(By.name("bmonth"))).selectByVisibleText(groupContData.getBmonth());
        groupHelper.wd.findElement(By.name("bmonth")).click();
        groupHelper.wd.findElement(By.name("byear")).click();
        groupHelper.wd.findElement(By.name("byear")).clear();
        groupHelper.wd.findElement(By.name("byear")).sendKeys(groupContData.getByear());
        groupHelper.wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    private void connectandlogin(String username, String password) {
        groupHelper.wd.get("http://localhost/addressbook/");
        groupHelper.wd.findElement(By.name("user")).click();
        groupHelper.wd.findElement(By.name("user")).clear();
        groupHelper.wd.findElement(By.name("user")).sendKeys(username);
        groupHelper.wd.findElement(By.name("pass")).clear();
        groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
        groupHelper.wd.findElement(By.id("LoginForm")).submit();
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
}
