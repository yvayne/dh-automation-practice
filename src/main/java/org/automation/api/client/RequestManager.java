package org.automation.api.client;

import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.automation.core.config.Environment;

import static io.restassured.RestAssured.given;

/**
 * Groups utility methods to send Api Rest requests.
 */
public final class RequestManager {

    private static final Logger LOGGER = LogManager.getLogger(RequestManager.class.getName());
    private static final String BASE_URL = Environment.config().getApiBaseUrl();

    /**
     * Private constructor for the ApiRequest Manager utility class.
     */
    private RequestManager() {
        // Default constructor.
    }

    /**
     * Sends a GET request to a specified end point.
     *
     * @param endpoint service end point.
     * @return service response.
     */
    public static Response get(final String endpoint) {
        return printResponse(given().when()
                .get(BASE_URL.concat(endpoint)));
    }

    /**
     * Prints the response body to log output.
     *
     * @param response response object.
     * @return unmodified response.
     */
    private static Response printResponse(final Response response) {
        LOGGER.info("============API Response body============");
        response.getBody().prettyPrint();
        return response;
    }
}
