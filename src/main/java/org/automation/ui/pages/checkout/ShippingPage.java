package org.automation.ui.pages.checkout;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines checkout shipping page object model.
 */
public class ShippingPage extends ShopBasePage {

    @FindBy(name = "processCarrier")
    private WebElement checkoutButton;

    @FindBy(id = "cgv")
    private WebElement agreementCheckbox;

    /**
     * Clicks proceed to checkout button.
     */
    public void clickProceedToCheckoutButton() {
        WebElementActions.clickElement(checkoutButton);
    }

    /**
     * Sets agreement checkbox.
     */
    public void setAgreementCheckbox() {
        setCheckboxState(agreementCheckbox, true);
    }

    /**
     * Unset agreement checkbox.
     */
    public void unsetAgreementCheckbox() {
        setCheckboxState(agreementCheckbox, false);
    }

    /**
     * Sets the checkbox state according to state parameter.
     *
     * @param webElement checkbox web element.
     * @param state      checkbox state.
     */
    private static void setCheckboxState(final WebElement webElement, final boolean state) {
        if (!webElement.isSelected() && state || webElement.isSelected() && !state) {
            webElement.click();
        }
    }
}
