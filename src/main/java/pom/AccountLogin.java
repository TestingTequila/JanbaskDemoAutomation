package pom;

import datarepo.TCLevelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Reuse;

public class AccountLogin {
    WebDriver driver;
    Reuse reuse;
    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@type='submit']");

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        reuse = new Reuse(driver);
    }

    public void enterEmail() {
        reuse.doSendKeys(emailTextBox, TCLevelData.EMAIL_ID);
    }

    public void enterPassword() {
        reuse.doSendKeys(passwordTextBox, TCLevelData.PASSWORD);
    }

    public void clickOnLoginButton() {
        reuse.doClick(loginButton);
    }
}
