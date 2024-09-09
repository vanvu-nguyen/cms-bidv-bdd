package stepDefinitions;

import PageUIs.adminSite.DashboardPageUI;
import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;

public class dashboardPageSteps extends BasePage {
    WebDriver driver;

    public dashboardPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }

    @Then("^I will be redirected to dashboard page$")
    public void iWillBeRedirectedToDashboardPage() {
        waitForElementVisible(driver, DashboardPageUI.DASHBOARD_ACTIVE_TAB);
    }
}
