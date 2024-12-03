@tag
Feature: Signup
  
  @tag2
  Scenario Outline: Invalid or missing fields during signup
    Given the username "<username>" is entered
    And the password "<password>" is entered
    And the phone number "<phonenumber>" is entered
    And the birthdate "<birthdate>" is entered
    When I attempt to sign up
    Then display a message "<message>"

    Examples:
    | username | password | phonenumber | birthdate   | message                  |
    |          | testpass | 1234567890  | 1990-01-01  | Username cannot be empty |
    | testuser |          | 1234567890  | 1990-01-01  | Password cannot be empty |
    | testuser | testpass |             | 1990-01-01  | Phone number required    |
    | testuser | testpass | 1234567890  |             | Birthdate required       |
    |          |          |             |             | All fields are required  |
    
    
    

  