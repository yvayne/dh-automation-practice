package org.automation.core.config;

import org.automation.ui.webdriver.DriverTypes;

import java.util.Objects;

/**
 * Groups methods to read environment config variables.
 */
public final class Environment {

    private static final String PROP_FILE = "gradle.properties";
    private static final String BROWSER = "browser";
    private static final String DRIVER_VERSION = "driverVersion";
    private static final String IMPLICIT_TIME_WAIT = "implicitTimeWait";
    private static final String EXPLICIT_TIME_WAIT = "explicitTimeWait";
    private static final String WEB_BASE_URL = "webBaseUrl";
    private static final String WEB_USER = "webUser";
    private static final String WEB_PASS = "webPass";
    private static final String API_BASE_URL = "apiBaseUrl";
    private static final String API_SCHEMAS_FOLDER_PATH = "schemasFolderPath";
    private static Environment instance;

    private final PropReader propReader;

    /**
     * Private constructor for {@link Environment} utility class.
     */
    private Environment() {
        propReader = new PropReader(PROP_FILE);
    }

    /**
     * Initializes singleton instance of {@link Environment}.
     *
     * @return singleton instance.
     */
    public static synchronized Environment config() {
        if (Objects.isNull(instance)) {
            instance = new Environment();
        }
        return instance;
    }

    /**
     * Gets browser configuration value.
     *
     * @return browser configuration value.
     */
    public DriverTypes getBrowser() {
        return DriverTypes.valueOf(propReader.getEnv(BROWSER).toUpperCase());
    }

    /**
     * Gets driver version value.
     *
     * @return driver version.
     */
    public String getDriverVersion() {
        return propReader.getEnv(DRIVER_VERSION);
    }

    /**
     * Gets base url for portal.
     *
     * @return base url.
     */
    public String getWebBaseUrl() {
        return propReader.getEnv(WEB_BASE_URL);
    }

    /**
     * Gets implicit time wait configuration value.
     *
     * @return implicit time wait value.
     */
    public int getImplicitTimeWait() {
        return Integer.parseInt(propReader.getEnv(IMPLICIT_TIME_WAIT));
    }

    /**
     * Gets explicit  time wait configuration value.
     *
     * @return explicit time wait.
     */
    public int getExplicitTimeWait() {
        return Integer.parseInt(propReader.getEnv(EXPLICIT_TIME_WAIT));
    }

    /**
     * Gets web user.
     *
     * @return web user.
     */
    public String getWebUser() {
        return propReader.getEnv(WEB_USER);
    }

    /**
     * Gets web user password.
     *
     * @return web user password.
     */
    public String getWebPass() {
        return propReader.getEnv(WEB_PASS);
    }

    /**
     * Get API base url.
     *
     * @return API base url.
     */
    public String getApiBaseUrl() {
        return propReader.getEnv(API_BASE_URL);
    }

    /**
     * Gets API schemas folder path.
     *
     * @return schemas folder path.
     */
    public String getApiSchemasFolderPath() {
        return propReader.getEnv(API_SCHEMAS_FOLDER_PATH);
    }
}
