package org.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.automation.ui.webdriver.DriverManager;
import org.testng.annotations.AfterTest;

/**
 * Defines cucumber TestNG runner class.
 */
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"org.automation"},
        features = {"src/test/resources/features"}
)
public final class Runner extends AbstractTestNGCucumberTests {

    /**
     * Executes code after all scenarios.
     */
    @AfterTest
    public void afterAllScenarios() {
        DriverManager.getInstance().quitDriver();
    }
}
