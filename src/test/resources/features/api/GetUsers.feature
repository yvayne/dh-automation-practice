@api
Feature: Get all users

  @acceptance
  Scenario: Verify that is possible to get all users information using page filter
    When I send a GET request to "/users?page=2"
    Then I validate that status code should be "200"
    And I validate that response body should match the "GetAllUsersSchema.json" JSON Schema
    And I validate that the following user information should be contained in response body
      | email     | michael.lawson@reqres.in |
      | firstName | Michael                  |
      | lastName  | Lawson                   |
