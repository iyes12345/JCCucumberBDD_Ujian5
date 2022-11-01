package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage login = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User open web Shop Demoqa")
    public void user_open_web_shop_demoqa() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Shop Demoqa");

    }

    @And("User click button dismiss")
    public void user_click_button_dismiss() {
        login.loginPageDismiss();
        extentTest.log(LogStatus.PASS, "User click button my account");
    }

    @And("User click button my account")
    public void user_click_button_myaccount() {
        login.loginPageMyaccount();
        extentTest.log(LogStatus.PASS, "User click button my account");
    }

    @And("User enter email password valid")
    public void user_enter_email_password_valid() {
        login.loginForm("dummy2225079@gmail.com", "Dummy12345$");
        extentTest.log(LogStatus.PASS, "User enter email password valid");
    }

    @Then("User click button login valid")
    public void user_click_button_login_valid() {
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }
}
