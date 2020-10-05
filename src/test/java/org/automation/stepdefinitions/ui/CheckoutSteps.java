package org.automation.stepdefinitions.ui;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.automation.ui.pages.checkout.AddressPage;
import org.automation.ui.pages.checkout.PaymentPage;
import org.automation.ui.pages.checkout.ShippingPage;
import org.automation.ui.pages.checkout.SummaryPage;

import static org.testng.Assert.assertEquals;

/**
 * Defines checkout page step definitions.
 */
public class CheckoutSteps {

    private SummaryPage summaryPage;
    private AddressPage addressPage;
    private ShippingPage shippingPage;
    private PaymentPage paymentPage;

    /**
     * Initializes an instance of {@link CheckoutSteps}.
     */
    public CheckoutSteps() {
        summaryPage = new SummaryPage();
        addressPage = new AddressPage();
        shippingPage = new ShippingPage();
        paymentPage = new PaymentPage();
    }

    /**
     * Click on proceed to checkout in checkout summary page.
     */
    @When("^I click on Proceed to checkout button from the Checkout Summary$")
    public void clickCheckoutButtonFromTheCheckoutSummary() {
        summaryPage.clickProceedToCheckoutButton();
    }

    /**
     * Click on proceed to checkout in checkout address page.
     */
    @When("^I click on Proceed to checkout button from the Checkout Address$")
    public void clickCheckoutButtonFromTheCheckoutAddress() {
        addressPage.clickProceedToCheckoutButton();
    }

    /**
     * Accepts terms for shipping option.
     */
    @When("^I accept the terms of service for shipping option$")
    public void acceptTheTermsOfServiceForShippingOption() {
        shippingPage.setAgreementCheckbox();
    }

    /**
     * Click on proceed to checkout in checkout shipping page.
     */
    @When("^I click on Proceed to checkout button from the Checkout Shipping$")
    public void clickCheckoutButtonFromTheCheckoutShipping() {
        shippingPage.clickProceedToCheckoutButton();
    }

    /**
     * Click on bank wire payment method.
     */
    @When("^I click on Bank Wire payment method$")
    public void clickOnBankWirePaymentMethod() {
        paymentPage.clickPayBankWireButton();
    }

    /**
     * Click on confirm order.
     */
    @When("^I click on confirm order$")
    public void clickOnConfirmOrder() {
        paymentPage.clickConfirmOrderButton();
    }

    /**
     * Asserts order confirmation message.
     *
     * @param expectedMessage expected confirmation order.
     */
    @Then("^the following message should be displayed in order confirmation$")
    public void messageShouldBeDisplayedInOrderConfirmation(final String expectedMessage) {
        assertEquals(paymentPage.getOrderConfirmationText(), expectedMessage);
    }
}
