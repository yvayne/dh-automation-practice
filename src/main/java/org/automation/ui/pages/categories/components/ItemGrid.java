package org.automation.ui.pages.categories.components;

import org.automation.ui.utils.WebElementActions;
import org.automation.ui.webdriver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Defines item grid component model.
 */
public class ItemGrid {

    private static final By ADD_TO_CART_BUTTON_LOC = By.cssSelector("div[class='product-container']");
    private static final By MORE_BUTTON_LOC = By.className("lnk_view");

    @FindBy(className = "ajax_block_product")
    private List<WebElement> itemsList;

    /**
     * Initializes an instance of {@link ItemGrid}.
     */
    public ItemGrid() {
        PageFactory.initElements(DriverManager.getInstance().getWebDriver(), this);
    }

    /**
     * Clicks on item's element according to index.
     *
     * @param itemNumber item index number.
     */
    public void clickItem(final int itemNumber) {
        int naturalIndex = itemNumber - 1;
        if (isValidItemNumber(naturalIndex)) {
            WebElement item = itemsList.get(naturalIndex);
            WebElementActions.clickElement(item);
            WebElement moreInfoButton = item.findElement(MORE_BUTTON_LOC);
            WebElementActions.clickElement(moreInfoButton);
        }
    }

    /**
     * Clicks on add to card item's button according to index.
     *
     * @param itemNumber item index number.
     */
    public void clickAddToCardItem(final int itemNumber) {
        int naturalIndex = itemNumber - 1;
        if (isValidItemNumber(naturalIndex)) {
            WebElement item = itemsList.get(naturalIndex);
            WebElement addToCardButton = item.findElement(ADD_TO_CART_BUTTON_LOC);
            WebElementActions.clickElement(addToCardButton);
        }
    }

    /**
     * Checks if item number is a valid value.
     *
     * @param itemNumber item number to be evaluated.
     * @return true if its value value, false otherwise.
     */
    private boolean isValidItemNumber(final int itemNumber) {
        return itemNumber < itemsList.size();
    }
}
