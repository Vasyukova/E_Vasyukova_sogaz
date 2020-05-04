package ru.stqa.pft.addressbook;

import java.security.acl.Group;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class testGroupCreation {
    private WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp(String username) throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("secret", "admin");
    }

    private void login(String username, String password)
    {
        wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.id("LoginForm")).submit();
    }

    @Test
    public void testGroupCreationTests() throws Exception {
        gotoNewGroup();
        CreateGroupName();
        fillGroupInfo(new GroupFillData("testev1", "testev2", "testev3"));
        //новый объект с атрибутами, которые используются потом в методе заполнения формы
        submitGroup();
        returnToGroupPage();
    }

    private void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    private void submitGroup() {
        wd.findElement(By.name("submit")).click();
    }

    private void CreateGroupName() {
        wd.findElement(By.name("group_name")).click();
    }

    private void gotoNewGroup() {
        wd.findElement(By.name("new")).click();
    }

    private void fillGroupInfo(GroupFillData groupFillData)
    {
        wd.findElement(By.xpath("//form[@action='/addressbook/group.php']")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupFillData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupFillData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupFillData.getFooter());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
