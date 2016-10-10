package TestCases;

import Pages.DashboardPage;
import Pages.LogInPage;
import Util.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * Created by Nikola on 10/9/2016.
 */
public class ClockInClockOutTest {

    WebDriver driver = BrowserFactory.startBrowser("edge", "http://shiftplanning.com/app/");
    LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
    DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

    @Test(enabled = true, priority = 0)
    public void verify_clock_in_clock_out() throws InterruptedException {
        logInPage.logIn("ivankovicive@yahoo.com", "nikola0807");
        Thread.sleep(12000);
        String dashValue = dashboardPage.getDashWidgetValue();
        dashboardPage.getClockInButton().click();
        Thread.sleep(3000);
        dashboardPage.getClockOutButton().click();
        Thread.sleep(5000);
        Assert.assertFalse(dashboardPage.getDashWidgetValue() == dashValue, "Clock in / Clock out test failed");

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(4000);
        driver.quit();
    }
}
