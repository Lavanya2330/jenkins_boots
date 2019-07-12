Feature: Logout from my account
  As a end user
  I want to click logout
  so that I logged out of my account
@smoke
  Scenario: Logout
    Given I am on Homepage
    When I login with positive credentials
    And I click logout link
    Then system should navigate to the homepage
