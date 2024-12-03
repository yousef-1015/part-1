@tag
Feature: Login

  @tag1
  Scenario Outline: Valid login
    Given the username should be filled "<username>"
    And the password should be filled "<password>"
    When I choose to login
    Then display a message "<message>"
    
    
       Examples:
| username | password    | message          |
| ahmad    | ahmadpass   | Login successful |
| kareem   | kareempass  | Login successful |
| fawzi    | fawzipass   | Login successful |
| khaled   | khlaedpass  | Login successful |
#| tamer    | wrongpass   | Login failed     | # Failing case



@tag
Scenario Outline: Login validation with missing fields
  Given the username should be filled "<username>"
  And the password should be filled "<password>"
  When I choose to login
  Then display a message "<message>"

Examples:
| username | password    | message       |
|          | ahmadpass   | Login failed  | # Missing username
| ahmad    |             | Login failed  | # Missing password
|          |             | Login failed  | # Both fields empty

