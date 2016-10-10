package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Nikola on 10/8/2016.
 */
public class LogInPage {

    WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "email")
    protected WebElement emailField;

    @FindBy(id = "password")
    protected WebElement passwordField;

    @FindBy(css = ".lfoot>button")
    protected WebElement loginButton;

    @FindBy(id = "incorrect")
    protected WebElement incorrectMessage;

    public WebElement getIncorrectMessage() {
        return incorrectMessage;
    }

    public void logIn(String email, String password) throws InterruptedException {
        emailField.clear();
        passwordField.clear();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        Thread.sleep(2000);

    }


}
