package org.automation.ui.pages.signin;

import org.automation.ui.pages.common.ShopBasePage;
import org.automation.ui.utils.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Defines SignIn page object model.
 */
public class SignInPage extends ShopBasePage {

    @FindBy(id = "email")
    private WebElement emailTextBox;

    @FindBy(id = "passwd")
    private WebElement passwordTextBox;

    @FindBy(name = "SubmitLogin")
    private WebElement signInButton;

    /**
     * Sets email text box.
     *
     * @param email email value.
     */
    public void setEmailTextBox(final String email) {
        WebElementActions.setInputField(emailTextBox, email);
    }

    /**
     * Sets password text box.
     *
     * @param pass password value.
     */
    public void setPasswordTextBox(final String pass) {
        WebElementActions.setInputField(passwordTextBox, pass);
    }

    /**
     * Clicks sign in button.
     */
    public void clickSignInButton() {
        WebElementActions.clickElement(signInButton);
    }
}
