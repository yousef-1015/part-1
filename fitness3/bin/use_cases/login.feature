@tag
Feature: Login

  @tag1
  Scenario Outline: Valid login
    Given the username should be filled "<username>"
    And the password should be filled "<password>"
    When I choose to login
    Then display a message "<expectedMessage>"

    Examples:
      | username    | password      | expectedMessage     |
      | testUser     | testPassword  | Login successful     |
      | admin       | adminPassword | Login successful     |
      | invalidUser   | wrongPassword | Login failed         |
      | testUser     | wrongPassword | Login failed         |