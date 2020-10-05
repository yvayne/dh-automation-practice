package org.automation.ui.pages.checkout;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines checkout address page object model.
 */
public class AddressPage extends ShopBasePage {

    @FindBy(name = "processAddress")
    private WebElement checkoutButton;

    /**
     * Clicks proceed to checkout button.
     */
    public void clickProceedToCheckoutButton() {
        WebElementActions.clickElement(checkoutButton);
    }
}
