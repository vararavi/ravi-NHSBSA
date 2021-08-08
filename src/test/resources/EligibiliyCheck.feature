@nhs
Feature: As a person from Wales

  Scenario Outline: Wales Test Ticket - Acceptance Criteria
    Given I am a person from Wales
    When I entered DOB for <age> years
    Then I should get a result of whether I will get help or not
    Examples:
      | age |
      | 16  |
      | 35  |
