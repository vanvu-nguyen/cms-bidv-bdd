package stepDefinitions;

import PageUIs.adminSite.LoginPUI;
import commons.BasePage;
import commons.GlobalConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageGenerator.AdminPageGeneratorManager;
import pageObjects.adminSite.LoginPO;

public class loginPageSteps extends BasePage {
    WebDriver driver;

    public loginPageSteps() {
        driver = Hooks.openAndQuitBrowser();
    }

    @Given("^I select English language$")
    public void iSelectEnglishLanguage() {
        selectItemInCustomDropdown(driver, LoginPUI.LANGUAGE_DROPDOWN_PARENT_LOCATOR, LoginPUI.LANGUAGE_DROPDOWN_CHILD_LOCATOR, "English");
    }

    @Given("^I input the username$")
    public void iInputTheUsername() {
        waitForElementVisible(driver, LoginPUI.USER_ID_TEXTBOX);
        senkeyToElement(driver, LoginPUI.USER_ID_TEXTBOX, GlobalConstants.DEV_ADMIN_USERNAME);
    }

    @Given("^I input the password$")
    public void iInputThePassword() {
        waitForElementVisible(driver, LoginPUI.PASSWORD_TEXTBOX);
        senkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, GlobalConstants.DEV_ADMIN_PASSWORD);
    }

    @When("^I press login button$")
    public void iPressLoginButton() {
        waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPUI.LOGIN_BUTTON);
    }

}
