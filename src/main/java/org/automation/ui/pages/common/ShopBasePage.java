package org.automation.ui.pages.common;

import org.automation.ui.pages.common.components.UtilityNavBar;
import org.automation.ui.pages.common.components.TabNavBar;
import org.automation.ui.utils.WebElementActions;
import org.automation.ui.webdriver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Defines the shop base page object model and groups common elements.
 */
public abstract class ShopBasePage {

    @FindBy(className = "logo")
    private WebElement logoImage;

    private final UtilityNavBar utilityNavBar;
    private final TabNavBar tabNavBar;

    /**
     * Initializes an instance of {@link ShopBasePage}.
     */
    public ShopBasePage() {
        PageFactory.initElements(DriverManager.getInstance().getWebDriver(), this);
        utilityNavBar = new UtilityNavBar();
        tabNavBar = new TabNavBar();
    }

    /**
     * Gets page title.
     *
     * @return page title.
     */
    public String getTitle() {
        return DriverManager.getInstance().getWebDriver().getTitle();
    }

    /**
     * Gets utility navigation bar component.
     *
     * @return utility navigation bar component.
     */
    public UtilityNavBar getUtilityNavBar() {
        return utilityNavBar;
    }

    /**
     * Gets tab navigation bar component.
     *
     * @return tab navigation bar component.
     */
    public TabNavBar getTabNavBar() {
        return tabNavBar;
    }

    /**
     * Checks if logo is displayed.
     *
     * @return true if its displayed, false otherwise.
     */
    public boolean isLogoDisplayed() {
        return WebElementActions.isDisplayed(logoImage);
    }
}
