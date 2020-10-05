package org.automation.ui.pages.common;

import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines the Home page object model.
 */
public class HomePage extends ShopBasePage {

    @FindBy(id = "editorial_block_center")
    private WebElement pageDescriptionText;

    /**
     * Checks if page description is displayed.
     *
     * @return true if its displayed, false otherwise.
     */
    public boolean isPageDescriptionDisplayed() {
        return WebElementActions.isDisplayed(pageDescriptionText);
    }
}
