package org.automation.utils;

import org.automation.ui.pages.common.HomePage;
import org.automation.ui.pages.signin.SignInPage;

/**
 * Defines utility methods for login actions.
 */
public final class LoginUtils {

    /**
     * Private constructor for {@link LoginUtils} utility class.
     */
    private LoginUtils() {

    }

    /**
     * Logins to shop page using credentials.
     *
     * @param user   email account.
     * @param pass   account password.
     * @param helper helper utility class.
     */
    public static void login(final String user, final String pass, final Helper helper) {
        if (!helper.isUserLogged()) {
            HomePage homePage = new HomePage();
            homePage.getUtilityNavBar().clickOnLoginButton();
            SignInPage signInPage = new SignInPage();
            signInPage.setEmailTextBox(user);
            signInPage.setPasswordTextBox(pass);
            signInPage.clickSignInButton();
            helper.setLoginStatus(true);
        }
    }
}
