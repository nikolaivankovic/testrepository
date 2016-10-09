package TestCases;


import Pages.LogInPage;
import Util.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


/**
 * Created by Nikola on 10/8/2016.
 */
public class LogInPageTest {


    WebDriver driver = BrowserFactory.startBrowser("firefox", "http://shiftplanning.com/app/");
    LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);


    @Test(enabled = true, priority = 0)
    public void verify_that_we_cannot_login_with_wrong_email() throws InterruptedException {
        driver.get("http://shiftplanning.com/app/");
        logInPage.logIn("ivankovicive@ive.com", "nikola0808");
        Assert.assertTrue(logInPage.getIncorrectMessage().isDisplayed(), "Log in with incorrect password message failed");

    }

    @Test(enabled = true, priority = 0)
    public void verify_that_we_cannot_login_with_wrong_password() throws InterruptedException {
        driver.get("http://shiftplanning.com/app/");
        logInPage.logIn("ivankovicive@yahoo.com", "nikola0808");
        Assert.assertTrue(logInPage.getIncorrectMessage().isDisplayed(), "Log in with incorrect password message failed");

    }

    @Test(enabled = true, priority = 1)
    public void verify_that_we_can_login_with_valid_user() throws InterruptedException {
        driver.get("http://shiftplanning.com/app/");
        logInPage.logIn("ivankovicive@yahoo.com", "nikola0807");
        Thread.sleep(20000);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://nikola0807.shiftplanning.com/app/dashboard/"), "Log In test failed");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    ;


}
