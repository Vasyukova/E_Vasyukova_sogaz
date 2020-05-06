package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    public final ApplicationManager appobj = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        appobj.initial();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        appobj.stop();
    }

    protected ApplicationManager getApplicationManager() {
        return appobj;
    }
}
