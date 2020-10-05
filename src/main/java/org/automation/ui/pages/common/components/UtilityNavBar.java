package org.automation.ui.pages.common.components;

import org.automation.ui.utils.WebElementActions;
import org.automation.ui.webdriver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Defines the utility navigation bar component model.
 */
public class UtilityNavBar {

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "contact-link")
    private WebElement contactUsButton;

    /**
     * Initializes an instance of {@link UtilityNavBar}.
     */
    public UtilityNavBar() {
        PageFactory.initElements(DriverManager.getInstance().getWebDriver(), this);
    }

    /**
     * Clicks on login button.
     */
    public void clickOnLoginButton() {
        WebElementActions.clickElement(signInButton);
    }

    /**
     * clicks on contact us button.
     */
    public void clickOnContactUsButton() {
        WebElementActions.clickElement(contactUsButton);
    }
}
