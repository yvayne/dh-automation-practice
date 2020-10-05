package org.automation.stepdefinitions.ui;

import cucumber.api.java.en.Given;
import org.automation.core.config.Environment;
import org.automation.ui.webdriver.DriverManager;
import org.automation.utils.Helper;
import org.automation.utils.LoginUtils;

/**
 * Groups login step definitions.
 */
public class LoginSteps {

    private static final String HOME_URL = Environment.config().getWebBaseUrl();

    private Helper helper;

    /**
     * Initializes an instance of {@link LoginSteps}.
     *
     * @param helper {@link Helper}
     */
    public LoginSteps(final Helper helper) {
        this.helper = helper;
    }

    /**
     * Login with valid credentials.
     */
    @Given("^I login to Automation Practice page with valid credentials$")
    public void loginWithValidCredentials() {
        DriverManager.getInstance().getWebDriver().get(HOME_URL);
        LoginUtils.login(Environment.config().getWebUser(), Environment.config().getWebPass(), helper);
    }
}
