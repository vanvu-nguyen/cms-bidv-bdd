package commons;

public class BaseElement {
    public static final String DYNAMIC_MENU_BY_NAME = "XPATH=//div[@class='info-sidebar-content']//span[@class='ant-menu-title-content' and text()='%s']/parent::div[@role='menuitem' and @aria-expanded='false']";
    public static final String DYNAMIC_SUBMENU_BY_NAME = "XPATH=//ul[contains(@class,'ant-menu-sub')]//span[text()='%s']/parent::li";
}
