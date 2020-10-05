package org.automation.ui.pages.cartmodal;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines cart checkout modal model.
 */
public class CartModal extends ShopBasePage {

    @FindBy(css = "#layer_cart .button-medium")
    private WebElement checkoutButton;

    /**
     * Clicks on checkout button.
     */
    public void clickCheckoutButton() {
        WebElementActions.clickElement(checkoutButton);
    }
}
