package org.automation.stepdefinitions.api;

import cucumber.api.Transpose;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.automation.api.client.RequestManager;
import org.automation.api.models.users.User;
import org.automation.api.models.users.UsersInfo;
import org.automation.core.config.Environment;
import org.automation.core.utils.FileUtils;
import org.automation.core.utils.JsonParser;

import java.util.List;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Defines request step definitions.
 */
public class RequestSteps {

    private static final String SCHEMAS_FOLDER = Environment.config().getApiSchemasFolderPath();
    private static final int FIRST_USER_INDEX = 0;

    private Response response;

    /**
     * Sends GET request to endpoint.
     *
     * @param endpoint endpoint url.
     */
    @When("^I send a GET request to \"([^\"]*)\"$")
    public void sendGetRequest(final String endpoint) {
        response = RequestManager.get(endpoint);
    }

    /**
     * Asserts response status code.
     *
     * @param expectedStatusCode expected status code.
     */
    @Then("^I validate that status code should be \"([^\"]*)\"$")
    public void validateResponseStatusCode(final int expectedStatusCode) {
        assertEquals(response.getStatusCode(), expectedStatusCode, "Response status code does not match.");
    }

    /**
     * Asserts response body json schema.
     *
     * @param schema json schema file.
     */
    @Then("^I validate that response body should match the \"([^\"]*)\" JSON Schema$")
    public void validateResponseBodyJsonSchema(final String schema) {
        response.then().assertThat().body(matchesJsonSchema(FileUtils.getFile(SCHEMAS_FOLDER.concat(schema))));
    }

    /**
     * Asserts that user information is contained in response body.
     *
     * @param users users objects from feature file.
     */
    @Then("^I validate that the following user information should be contained in response body$")
    public void validateUserInformationInResponseBody(final @Transpose List<User> users) {
        User user = users.get(FIRST_USER_INDEX);
        UsersInfo usersInfo = JsonParser.fromJsonString(response.body().asString(), UsersInfo.class);
        List<User> usersInResponse = usersInfo.getUsers();
        assertTrue(usersInResponse.contains(user), "User is not contained in response body.");
    }
}
