package stepDefinitions;

import PageUIs.adminSite.PosManagementPageUI;
import commons.BaseElement;
import commons.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class posManagementPageSteps extends BasePage {
    WebDriver driver;

    public posManagementPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
    }

    @Given("^I have accessed to pos management page$")
    public void iHaveAccessedToPosManagementPage() {
        if (isElementUndisplayed(driver, BaseElement.DYNAMIC_MENU_BY_NAME, "POS service")) {
            waitForElementClickable(driver, BaseElement.DYNAMIC_SUBMENU_BY_NAME, "POS management");
            clickToElement(driver, BaseElement.DYNAMIC_SUBMENU_BY_NAME, "POS management");
            waitForElementVisible(driver, PosManagementPageUI.POS_MANAGEMENT_ACTIVE_TAB);
        } else {
            waitForElementClickable(driver, BaseElement.DYNAMIC_MENU_BY_NAME, "POS service");
            clickToElement(driver, BaseElement.DYNAMIC_MENU_BY_NAME, "POS service");
            waitForElementClickable(driver, BaseElement.DYNAMIC_SUBMENU_BY_NAME, "POS management");
            clickToElement(driver, BaseElement.DYNAMIC_SUBMENU_BY_NAME, "POS management");
            waitForElementVisible(driver, PosManagementPageUI.POS_MANAGEMENT_ACTIVE_TAB);
        }
    }

    @When("^I click to add button$")
    public void iClickToAddButton() {
        waitForElementClickable(driver, PosManagementPageUI.ADD_BUTTON);
        clickToElement(driver, PosManagementPageUI.ADD_BUTTON);
    }

    @When("^I click to select service id button$")
    public void iClickToSelectServiceIdButton() {
        waitForElementClickable(driver, PosManagementPageUI.SERVICE_ID_SELECT_BUTTON);
        clickToElement(driver, PosManagementPageUI.SERVICE_ID_SELECT_BUTTON);
    }

    @Then("^The select customer modal displayed$")
    public void theSelectCustomerModalDisplayed() {
       waitForElementVisible(driver, PosManagementPageUI.SELECT_CUSTOMER_MODAL);
    }

    @When("^I input to service id searchbox on modal with value \"([^\"]*)\"$")
    public void iInputToServiceIdSeabrchboxOnModalWithValue(String arg1) {
        waitForElementVisible(driver, PosManagementPageUI.SERVICE_ID_SEARCHBOX_IN_MODAL);
        senkeyToElement(driver, PosManagementPageUI.SERVICE_ID_SEARCHBOX_IN_MODAL, arg1);
    }

    @When("^I click to search customer button on modal$")
    public void iClickToSearchCustomerButtonOnModal() {
        waitForElementClickable(driver, PosManagementPageUI.SEARCH_CUSTOMER_BUTTON_IN_MODAL);
        clickToElement(driver, PosManagementPageUI.SEARCH_CUSTOMER_BUTTON_IN_MODAL);
    }

    @When("^I click to expected service id record with value")
    public void iClickToExpectedServiceIdRecordWithValue() {
        waitForElementClickable(driver, PosManagementPageUI.FIRST_RECORD_BY_SERVICE_ID_IN_MODAL);
        clickToElement(driver, PosManagementPageUI.FIRST_RECORD_BY_SERVICE_ID_IN_MODAL);
    }

    @When("^I click to confirm the selected service id$")
    public void iClickToConfirmTheSelectedServiceId() {
        waitForElementClickable(driver, PosManagementPageUI.CONFIRM_SELECTED_CUSTOMER_BUTTON_IN_MODAL);
        clickToElement(driver, PosManagementPageUI.CONFIRM_SELECTED_CUSTOMER_BUTTON_IN_MODAL);
    }

    @When("^I select the beneficiary account with value (\\d+)$")
    public void iSelectTheBeneficiaryAccountWithValue(String arg1) {
        waitForElementClickable(driver, PosManagementPageUI.BENEFICIARY_ACCOUNT_DROPDOWN_PARENT);
        clickToElement(driver, PosManagementPageUI.BENEFICIARY_ACCOUNT_DROPDOWN_PARENT);
        waitForElementClickable(driver, PosManagementPageUI.BENEFICIARY_ACCOUNT_DROPDOWN_CHILD_BY_TEXT, arg1);
        clickToElement(driver, PosManagementPageUI.BENEFICIARY_ACCOUNT_DROPDOWN_CHILD_BY_TEXT, arg1);
    }

    @When("^I click to select provider id button$")
    public void iClickToSelectProviderIdButton() {
        waitForElementClickable(driver, PosManagementPageUI.PROVIDER_ID_SELECT_BUTTON);
        clickToElement(driver, PosManagementPageUI.PROVIDER_ID_SELECT_BUTTON);
    }

    @Then("^The select provider displayed$")
    public void theSelectProviderDisplayed() {
        waitForElementVisible(driver, PosManagementPageUI.SELECT_PROVIDER_MODAL);
    }

    @When("^I input to provider id searchbox on modal with value \"([^\"]*)\"$")
    public void iInputToProviderIdSearchboxOnModalWithValue(String arg1) {
        removeAttributeInDOM(driver, PosManagementPageUI.PROVIDER_ID_SEARCHBOX_IN_MODAL, "value");
        waitForElementVisible(driver, PosManagementPageUI.PROVIDER_ID_SEARCHBOX_IN_MODAL);
        senkeyToElement(driver, PosManagementPageUI.PROVIDER_ID_SEARCHBOX_IN_MODAL, arg1);
    }

    @When("^I click to search provider button on modal$")
    public void iClickToSearchProviderButtonOnModal() {
        waitForElementClickable(driver, PosManagementPageUI.SEARCH_PROVIDER_BUTTON_IN_MODAL);
        clickToElement(driver, PosManagementPageUI.SEARCH_PROVIDER_BUTTON_IN_MODAL);
    }

    @When("^I click to the expected provider id record with value \"([^\"]*)\"$")
    public void iClickToTheExpectedProviderIdRecordWithValue(String arg1) {
        waitForElementClickable(driver, PosManagementPageUI.DYNAMIC_RECORD_BY_PROVIDER_ID_IN_MODAL, arg1);
        clickToElement(driver, PosManagementPageUI.DYNAMIC_RECORD_BY_PROVIDER_ID_IN_MODAL, arg1);
    }

    @When("^I click to confirm the selected provider id$")
    public void iClickToConfirmTheSelectedProviderId() {
        waitForElementClickable(driver, PosManagementPageUI.CONFIRM_SELECTED_PROVIDER_BUTTON_IN_MODAL);
        clickToElement(driver, PosManagementPageUI.CONFIRM_SELECTED_PROVIDER_BUTTON_IN_MODAL);
    }

    @When("^I input to pos id with value (\\d+)$")
    public void iInputToPosIdWithValue(String arg1) {
        waitForElementVisible(driver, PosManagementPageUI.POS_ID_TEXTBOX);
        senkeyToElement(driver, PosManagementPageUI.POS_ID_TEXTBOX, arg1);
    }

    @When("^I click to save pos id button$")
    public void iClickToSavePosIdButton() {
        waitForElementClickable(driver, PosManagementPageUI.SAVE_BUTTON);
        clickToElement(driver, PosManagementPageUI.SAVE_BUTTON);
        waitForElementClickable(driver, PosManagementPageUI.SUCCESS_CONFIRM_CLOSE_BUTTON);
        clickToElement(driver, PosManagementPageUI.SUCCESS_CONFIRM_CLOSE_BUTTON);
    }

    @When("^I input to service id searchbox with value \"([^\"]*)\"$")
    public void iInputToServiceIdSearchboxWithValue(String arg1) {
        waitForElementVisible(driver, PosManagementPageUI.SERVICE_ID_SEARCHBOX);
        senkeyToElement(driver, PosManagementPageUI.SERVICE_ID_SEARCHBOX, arg1);
    }

    @When("^I click to search pos id button$")
    public void iClickToSearchPosIdButton() {
        waitForElementClickable(driver, PosManagementPageUI.SEARCH_BUTTON);
        clickToElement(driver, PosManagementPageUI.SEARCH_BUTTON);
    }

    @Then("^The (\\d+) will be listed with the corresponding service id$")
    public void theWillBeListedWithTheCorresponding(String arg1) {
        System.out.println(arg1);
        int precedingSiblingsOfPosIdColumn = getListElementSize(driver, PosManagementPageUI.PRECEDING_SIBLING_OF_POS_ID_COLUMN);
        String posIdColumnIndexInString = String.valueOf(precedingSiblingsOfPosIdColumn + 1);
        List<WebElement> posIdList = getListElement(driver, PosManagementPageUI.POS_ID_COLUMN_VALUE, posIdColumnIndexInString);
        ArrayList<String> posIdListValue = new ArrayList<>();
        for (WebElement element: posIdList) {
            posIdListValue.add(element.getText());
        }
        System.out.println(posIdListValue);
        boolean isPosIsExisted = false;
        for (String s : posIdListValue) {
            if (s.equals(arg1)) {
                isPosIsExisted = true;
                break;
            }
        }
        Assert.assertTrue(isPosIsExisted);
    }

}
