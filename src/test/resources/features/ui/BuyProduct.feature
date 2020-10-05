@ui
Feature: Buy Product

  Background:
    Given I login to Automation Practice page with valid credentials
    And I go to Automation Practice home page

  @acceptance
  Scenario: Verify that's possible to buy a product using wire transfer checkout option
    Given I click on the "WOMEN" button from the navigation bar
    When I click on the "1"st product item in grid view
      And I click Add to cart button
      And I click on Proceed to checkout button from the cart modal
      And I click on Proceed to checkout button from the Checkout Summary
      And I click on Proceed to checkout button from the Checkout Address
      And I accept the terms of service for shipping option
      And I click on Proceed to checkout button from the Checkout Shipping
      And I click on Bank Wire payment method
      And I click on confirm order
    Then the following message should be displayed in order confirmation
      """
      Your order on My Store is complete.
      """
