package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.AccountLogin;
import pom.MyAccount;
import pom.MyStore;

import static stepDefinitions.Hooks.driver;

public class Login {
    MyStore ms;
    AccountLogin al;
    MyAccount ma;

    @Given("Click on My Account icon")
    public void click_on_my_account_icon() throws InterruptedException {
        ms = new MyStore(driver);
        ms.clickOnMyAccountIcon();
    }

    @When("Click on login Link")
    public void click_on_login_link() {
        ms.clickOnLoginLink();
    }

    @When("Enter correct email")
    public void enter_correct_email() {
        al = new AccountLogin(driver);
        al.enterEmail();
    }

    @When("Enter correct password")
    public void enter_correct_password() {
        al.enterPassword();
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        al.clickOnLoginButton();
    }

    @Then("Validate Login Status")
    public void validate_login_status() {
        ma = new MyAccount(driver);
        ma.validateLoginStatus();
    }

}
