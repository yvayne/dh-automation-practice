package org.automation.ui.pages.checkout;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines checkout payment page object model.
 */
public class PaymentPage extends ShopBasePage {

    @FindBy(css = ".bankwire")
    private WebElement payBankWireButton;

    @FindBy(css = ".cheque")
    private WebElement payCheckButton;

    @FindBy(css = "#cart_navigation .button-medium")
    private WebElement confirmOrderButton;

    @FindBy(css = ".cheque-indent")
    private WebElement orderConfirmationText;

    /**
     * Clicks pay bank wire button.
     */
    public void clickPayBankWireButton() {
        WebElementActions.clickElement(payBankWireButton);
    }

    /**
     * Clicks pay check button.
     */
    public void clickPayCheckButton() {
        WebElementActions.clickElement(payCheckButton);
    }

    /**
     * Clicks confirm order button.
     */
    public void clickConfirmOrderButton() {
        WebElementActions.clickElement(confirmOrderButton);
    }

    /**
     * Gets order confirmation text.
     *
     * @return order confirmation text.
     */
    public String getOrderConfirmationText() {
        return WebElementActions.getTextElement(orderConfirmationText);
    }
}
