package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HandlingBrowsers {
    static WebDriver driver = null;

    public static WebDriver launchBrowser(String browserName) {
        switch (browserName) {
            case "Edge":
                driver = new EdgeDriver();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Safari":
                driver = new SafariDriver();
                break;
        }
        return driver;
    }
}
