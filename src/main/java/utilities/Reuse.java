package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Reuse
{
    WebDriver driver;

    public Reuse(WebDriver driver)
    {
        this.driver = driver;
    }

    public void doClick(By locator)
    {
        WebElement element= driver.findElement(locator);
        element.click();
    }

    public void doSendKeys(By locator, String text)
    {
        WebElement inputTextBox = driver.findElement(locator);
        inputTextBox.sendKeys(text);
    }

    public void doValidatePageTitle(String expectedPageTitle, String successMessage, String failureMessage)
    {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, expectedPageTitle);
    }

    public void doDDLSelectByValue(By locator,String value)
    {
        WebElement  ddlList =driver.findElement(locator);
        Select country = new Select(ddlList);
        country.selectByValue(value);
    }

    public void doDDLSelectByVisibleText(By locator,String text)
    {
        WebElement  ddlList =driver.findElement(locator);
        Select country = new Select(ddlList);
        country.selectByVisibleText(text);
    }

    public void doDDLSelectByIndex(By locator,int index)
    {
        WebElement  ddlList =driver.findElement(locator);
        Select country = new Select(ddlList);
        country.selectByIndex(index);
    }
}
