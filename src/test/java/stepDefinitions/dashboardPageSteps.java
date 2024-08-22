package stepDefinitions;

import PageUIs.adminSite.DashboardPUI;
import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.adminSite.DashboardPO;

public class dashboardPageSteps extends BasePage {
    WebDriver driver;

    public dashboardPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }

    @Then("^I am redirected to admin dashboard page$")
    public void iAmRedirectedToAdminDashboardPage() {
        waitForElementVisible(driver, DashboardPUI.ACTIVE_DASHBOARD_TAB);
    }
}
