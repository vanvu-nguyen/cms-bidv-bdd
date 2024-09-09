package stepDefinitions;

import PageUIs.adminSite.LoginPageUI;
import commons.BasePage;
import commons.GlobalConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

public class loginPageSteps extends BasePage {
    WebDriver driver;

    public loginPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }

    @Given("^I have accessed to admin login site$")
    public void iHaveAccessedToAdminLoginSite() {
        waitForElementVisible(driver, LoginPageUI.DANG_NHAP_BUTTON);
    }

    @When("^I select the English language option$")
    public void iSelectTheEnglishLanguageOption() {
        waitForElementClickable(driver, LoginPageUI.LANGUAGE_DROPDOWN_PARENT);
        clickToElement(driver, LoginPageUI.LANGUAGE_DROPDOWN_PARENT);
        waitForElementVisible(driver, LoginPageUI.LANGUAGE_DROPDOWN_ENGLISH_OPTION);
        clickToElement(driver, LoginPageUI.LANGUAGE_DROPDOWN_ENGLISH_OPTION);
    }

    @When("^I input to username textbox$")
    public void iInputToUsernameTextbox() {
        waitForElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
        senkeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, GlobalConstants.DEV_ADMIN_USERNAME);
    }

    @When("^I input to password textbox$")
    public void iInputToPasswordTextbox() {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, GlobalConstants.DEV_ADMIN_PASSWORD);
    }

    @When("^I click to login button$")
    public void iClickToLoginButton() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }


}
