package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Nikola on 10/8/2016.
 */
public class BrowserFactory {


    static WebDriver driver;


    public static WebDriver startBrowser(String browser, String url) {
        if (browser.equalsIgnoreCase("FIREFOX")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("CHROME")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src/main/resources/Drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("EDGE")) {
            System.setProperty("webdriver.edge.driver", "src/main/resources/Drivers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }


}
