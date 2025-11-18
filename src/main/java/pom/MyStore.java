package pom;

import datarepo.AppLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Reuse;

import java.time.Duration;

public class MyStore {
    WebDriver driver;
    Reuse reuse;

    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");

    public MyStore(WebDriver driver) {
        this.driver = driver;
        reuse = new Reuse(driver);
    }

    public void clickOnMyAccountIcon() {
        reuse.doClick(myAccountIcon);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(AppLevel.WAIT_TIME));
    }

    public void clickOnLoginLink() {
        reuse.doClick(loginLink);
    }
}
