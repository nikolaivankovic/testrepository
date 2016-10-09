package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nikola on 10/9/2016.
 */
public class SchedulePage {

    WebDriver driver;
    public SchedulePage(WebDriver driver){this.driver=driver;}

    @FindBy (css = ".addEmployee")
    protected WebElement addEmployeeButton;

    @FindBy (id = "fname_1")
    protected WebElement employeeFirstName;

    @FindBy (id = "lname_1")
    protected WebElement employeeLastName;

    @FindBy (id = "email_1")
    protected WebElement employeeEmail;

    @FindBy (id = "add_employee_btn")
    protected WebElement addEmployeeFormButton;
}
