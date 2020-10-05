package org.automation.utils;

/**
 * Helper class to share information using dependency injection.
 */
public class Helper {

    private boolean loginStatus;

    /**
     * Sets login status.
     *
     * @param status login status to be set.
     */
    public void setLoginStatus(final boolean status) {
        loginStatus = status;
    }

    /**
     * Returns login status flag value.
     *
     * @return login status flag.
     */
    public boolean isUserLogged() {
        return loginStatus;
    }
}
