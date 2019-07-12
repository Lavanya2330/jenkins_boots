Feature: registration
  As a end user
  I want to register for an account
  So that I can buy products
@smoke
  Scenario: registration
    Given I am on Homepage
    When I complete the registration process
    Then I am registered successfully