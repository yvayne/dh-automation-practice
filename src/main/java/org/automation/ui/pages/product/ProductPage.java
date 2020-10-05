package org.automation.ui.pages.product;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines product page object model.
 */
public class ProductPage extends ShopBasePage {

    @FindBy(css = "button[name='Submit']")
    private WebElement addToCartButton;

    /**
     * Clicks add to cart button.
     */
    public void clickAddToCartButton() {
        WebElementActions.clickElement(addToCartButton);
    }
}
