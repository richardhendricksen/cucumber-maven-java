Feature: Login feature
  Scenario: Login
    Given I am registered
    When I login
    Then I should be logged in