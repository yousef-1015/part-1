
@tag
Feature: Account Management


@tag1
Scenario Outline: Create client profile
    Given the client name is filled "<name>"
    And the client age is filled "<age>"
    And the client email is filled "<email>"
    And the client fitness goal is filled "<fitnessGoal>"
    And the client dietary preference is filled "<dietaryPreference>"
    When I attempt to create the client profile
    Then the message should appear "<message>"

    Examples: 
      | name        | age | email               | fitnessGoal       | dietaryPreference | message                          |
      | John Doe   | 30  | john@example.com    | Weight Loss       | Vegetarian        | Profile created successfully      |
      | Jane Smith | 25  | jane@example.com    | Muscle Building   | Keto              | Profile created successfully      |
      |            | 28  | invalidEmail        | Cardio            | Vegan             | Email format is invalid          |
      | Alice Brown | -5  | alice@example.com   | Flexibility       | None              | Age must be a positive number    |
      | Bob White   | 40  | bob@example.com     | Weight Loss       | Gluten-Free       | Profile created successfully      |
      | Charlie Black| 22 | charlie@example.com | Muscle Building   | None              | Profile created successfully      |
      | Dave Green  | 35  | dave@example.com    |                    | Vegetarian        | Fitness goal cannot be empty     |