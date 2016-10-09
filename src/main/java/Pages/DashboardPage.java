package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nikola on 10/9/2016.
 */
public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){this.driver = driver;}

    @FindBy (xpath = ".//*[@id='tc_tl_ci']")
    protected WebElement clockInButton;

    @FindBy (xpath = ".//*[@id='tc_tl_co']")
    protected WebElement clockOutButton;

    @FindBy (css = ".dash_notification_widget>h1")
    protected WebElement dashWidget;
}
