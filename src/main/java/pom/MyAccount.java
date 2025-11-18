package pom;

import datarepo.TCLevelData;
import org.openqa.selenium.WebDriver;
import utilities.Reuse;

public class MyAccount
{
    WebDriver driver;
    Reuse reuse;
    public MyAccount(WebDriver driver)
    {
        this.driver = driver;
        reuse = new Reuse(driver);
    }
    public void validateLoginStatus()
    {
       reuse.doValidatePageTitle(TCLevelData.EXPECTED_PAGE_TITLE, TCLevelData.LOGIN_SUCCESS_MSG, TCLevelData.LOGIN_FAILURE_MSG);
    }
}
