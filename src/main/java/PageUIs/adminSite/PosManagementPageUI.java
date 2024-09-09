package PageUIs.adminSite;

public class PosManagementPageUI {
    public static final String POS_MANAGEMENT_ACTIVE_TAB = "XPATH=//li[@class='posManagement active']";
    public static final String ADD_BUTTON = "XPATH=//span[text()='Add']/parent::button";
    public static final String SERVICE_ID_SELECT_BUTTON = "XPATH=//label[text()='Service ID']/following-sibling::div//span[text()='Select']/parent::button";
    public static final String SELECT_CUSTOMER_MODAL = "XPATH=//div[@class='header-modal']/span[text()='Select customer']";
    public static final String SERVICE_ID_SEARCHBOX_IN_MODAL = "XPATH=//div[@class='search-modal']//input[@id='serviceId']";
    public static final String DYNAMIC_RECORD_BY_SERVICE_ID_IN_MODAL = "XPATH=//div[@class='ant-modal-body']//div[@class='dx-datagrid-content']//td[text()='%s']/following-sibling::td";
    public static final String FIRST_RECORD_BY_SERVICE_ID_IN_MODAL = "XPATH=//div[@class='ant-modal-body']//tr[@aria-rowindex='1']/td[3]";
    public static final String CONFIRM_SELECTED_CUSTOMER_BUTTON_IN_MODAL = "XPATH=//div[@class='ant-modal-footer']//span[text()='Select']/parent::button";
    public static final String SEARCH_CUSTOMER_BUTTON_IN_MODAL = "XPATH=//div[@class='search-modal']//span[text()='Search']/parent::button";
    public static final String BENEFICIARY_ACCOUNT_DROPDOWN_PARENT = "XPATH=//label[text()='Beneficiary account']/following-sibling::div[@class='ant-form-item']//div[@class='ant-select-selector']";
    public static final String BENEFICIARY_ACCOUNT_DROPDOWN_CHILD_BY_TEXT = "XPATH=//div[text()='%s']/parent::div";
    public static final String PROVIDER_ID_SELECT_BUTTON = "XPATH=//label[text()='Provider ID']/following-sibling::div//span[text()='Select']/parent::button";
    public static final String SELECT_PROVIDER_MODAL = "XPATH=//div[@class='header-modal']/span[text()='Select provider']";
    public static final String SEARCH_PROVIDER_BUTTON_IN_MODAL = "XPATH=//div[@class='ant-modal-body']//div[@class='custom-search-modal']//span[text()='Search']/parent::button";
    public static final String DYNAMIC_RECORD_BY_PROVIDER_ID_IN_MODAL = "xpath=//div[@class='ant-modal-body']//td[text()='%s']/following-sibling::td";
    public static final String CONFIRM_SELECTED_PROVIDER_BUTTON_IN_MODAL = "XPATH=//div[@class='ant-modal-wrap' and not(@style='display: none;')]//div[@class='ant-modal-footer']//span[text()='Select']/parent::button";
    public static final String SUCCESS_CONFIRM_CLOSE_BUTTON = "XPATH=//span[text()='Close']//ancestor::div[@class='ant-modal-confirm-btns']/button";
    public static final String PROVIDER_ID_SEARCHBOX_IN_MODAL = "XPATH=//div[@class='ant-modal-body']//input[@id='providerId']";
    public static final String POS_ID_TEXTBOX = "XPATH=//label[text()='POS ID']/following-sibling::div[@class='ant-form-item']//input[@id='posId']";
    public static final String SAVE_BUTTON = "XPATH=//span[text()='Save']/parent::button";
    public static final String SERVICE_ID_SEARCHBOX = "XPATH=//div[@class='page-content-template']//input[@id='serviceId']";
    public static final String SEARCH_BUTTON = "XPATH=//div[@class='page-content-template']//span[text()='Search']/parent::button";
    public static final String PRECEDING_SIBLING_OF_POS_ID_COLUMN = "XPATH=//div[@class='dx-datagrid-headers']//div[text()='POS ID']/parent::td/preceding-sibling::td";
    public static final String POS_ID_COLUMN_VALUE = "XPATH=//div[@class='dx-datagrid-content']//tbody//tr[not(contains(@class,'invisible'))]/td[%s]";
}
