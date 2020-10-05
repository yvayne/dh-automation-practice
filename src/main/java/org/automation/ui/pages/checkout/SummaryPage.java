package org.automation.ui.pages.checkout;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines checkout summary page object model.
 */
public class SummaryPage extends ShopBasePage {

    @FindBy(css = ".standard-checkout")
    private WebElement checkoutButton;

    /**
     * Clicks proceed to checkout button.
     */
    public void clickProceedToCheckoutButton() {
        WebElementActions.clickElement(checkoutButton);
    }
}
