package stepDefinitions;

import datarepo.AppLevel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp(Scenario scenario) {
        driver = utilities.HandlingBrowsers.launchBrowser(AppLevel.BROWSER_NAME);
        driver.get(AppLevel.APP_URL);
        driver.manage().window().maximize();
        System.out.printf("scenario.getSourceTagNames(): " + scenario.getSourceTagNames());
        System.out.printf("scenario.getName(): " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.printf("scenario.getSourceTagNames(): " + scenario.isFailed());
        {
            byte[] srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(srcScreenshot, "image/png", scenario.getName());
        }
        driver.close();
    }
}
