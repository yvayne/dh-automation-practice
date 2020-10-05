package org.automation.ui.pages.common.components;

import org.automation.core.Actionable;
import org.automation.ui.utils.WebElementActions;
import org.automation.ui.webdriver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.EnumMap;
import java.util.Map;

/**
 * Defines the tab navigation bar component model.
 */
public class TabNavBar {

    @FindBy(css = "a[title='Women']")
    private WebElement womenTab;

    @FindBy(css = ".sf-menu > li > a[title='Dresses']")
    private WebElement dressesTab;

    @FindBy(css = ".sf-menu > li > a[title='T-shirts']")
    private WebElement tShirtsTab;

    /**
     * Initializes an instance of {@link TabNavBar}.
     */
    public TabNavBar() {
        PageFactory.initElements(DriverManager.getInstance().getWebDriver(), this);
    }

    /**
     * Checks if women tab is displayed.
     */
    public void clickWomenButton() {
        WebElementActions.clickElement(womenTab);
    }

    /**
     * Checks if dresses tab is displayed.
     */
    public void clickDressesButton() {
        WebElementActions.clickElement(dressesTab);
    }

    /**
     * Checks if t-shirt tab is displayed.
     */
    public void clickTShirtsButton() {
        WebElementActions.clickElement(tShirtsTab);
    }

    /**
     * Clicks on nav bar button according to parameter.
     *
     * @param button utility bar button.
     */
    public void clickOnButton(final TabNavBarButtons button) {
        Map<TabNavBarButtons, Actionable> strategy = new EnumMap<>(TabNavBarButtons.class);
        strategy.put(TabNavBarButtons.WOMEN, this::clickWomenButton);
        strategy.put(TabNavBarButtons.DRESSES, this::clickDressesButton);
        strategy.put(TabNavBarButtons.T_SHIRTS, this::clickTShirtsButton);
        strategy.get(button).execute();
    }
}
