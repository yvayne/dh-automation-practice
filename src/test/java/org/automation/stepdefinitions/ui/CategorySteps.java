package org.automation.stepdefinitions.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.automation.ui.pages.cartmodal.CartModal;
import org.automation.ui.pages.categories.CategoriesPage;
import org.automation.ui.pages.product.ProductPage;

/**
 * Defines step definitions for items category page.
 */
public class CategorySteps {

    private CategoriesPage page;
    private ProductPage productPage;
    private CartModal modal;

    /**
     * Initializes an instance of {@link CategorySteps}.
     */
    public CategorySteps() {
        page = new CategoriesPage();
        modal = new CartModal();
        productPage = new ProductPage();
    }

    /**
     * Clicks on item from grid element.
     *
     * @param itemNumber item number from grid.
     */
    @Given("^I click on the \"([^\"]*)\"(?:st|nd|rd|th) product item in grid view$")
    public void clickAddToCartButton(final int itemNumber) {
        page.getItemGrid().clickItem(itemNumber);
    }

    /**
     * Clicks on proceed to checkout button from cart modal.
     */
    @When("^I click on Proceed to checkout button from the cart modal$")
    public void clickProceedToCheckoutButtonFromModal() {
        modal.clickCheckoutButton();
    }

    /**
     * Clicks on add to card button.
     */
    @When("^I click Add to cart button$")
    public void iClickAddToCartButton() {
        productPage.clickAddToCartButton();
    }
}
