package TestCases;

import Pages.LogInPage;
import Pages.SchedulePage;
import Util.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * Created by Nikola on 10/10/2016.
 */
public class AddEmployeeTest {

    WebDriver driver = BrowserFactory.startBrowser("edge", "http://shiftplanning.com/app/");
    SchedulePage schedulePage = PageFactory.initElements(driver, SchedulePage.class);
    LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);

    @Test(enabled = true, priority = 0)
    public void verify_that_the_employee_is_added() throws InterruptedException {
        logInPage.logIn("ivankovicive@yahoo.com", "nikola0807");
        Thread.sleep(12000);
        driver.get("https://nikola0807.shiftplanning.com/app/schedule/employee/week/overview/overview/10%2c9%2c2016/");
        schedulePage.getAddEmployeeButton().click();
        Thread.sleep(2000);
        schedulePage.getEmployeeFirstName().sendKeys("Jon");
        schedulePage.getEmployeeLastName().sendKeys("Doe");
        Thread.sleep(2000);
        schedulePage.getEmployeeEmail().sendKeys("john@doe.com");
        schedulePage.getAddEmployeeFormButton().click();
        Thread.sleep(11000);
        schedulePage.getAddEmployeeFormButton().click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Jon Doe"), "Employee is not added");

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        driver.manage().deleteAllCookies();
        Thread.sleep(4000);
        driver.quit();
    }


}
