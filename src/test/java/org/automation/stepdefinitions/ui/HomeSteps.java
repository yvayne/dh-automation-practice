package org.automation.stepdefinitions.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.automation.core.config.Environment;
import org.automation.ui.pages.common.HomePage;
import org.automation.ui.pages.common.components.TabNavBarButtons;
import org.automation.ui.webdriver.DriverManager;

/**
 * Defines step definitions for Home page.
 */
public class HomeSteps {

    private static final String HOME_URL = Environment.config().getWebBaseUrl();

    private final HomePage page;

    /**
     * Initializes an instance of {@link HomeSteps}.
     */
    public HomeSteps() {
        page = new HomePage();
    }

    /**
     * Navigates to automation practice home page.
     */
    @Given("^I go to Automation Practice home page$")
    public void goToHomePage() {
        DriverManager.getInstance().getWebDriver().get(HOME_URL);
    }

    /**
     * Clicks on navigation bar button according to parameter.
     *
     * @param button button enum.
     */
    @When("^I click on the \"([^\"]*)\" button from the navigation bar$")
    public void clickOnButtonFromNavigationBar(final TabNavBarButtons button) {
        page.getTabNavBar().clickOnButton(button);
    }


}
