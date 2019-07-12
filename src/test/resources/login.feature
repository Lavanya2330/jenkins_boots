Feature:Login
  As a registered user
  I want to do login into my account
  So that I should able to see welcome message with my name
  @smoke
  Scenario: Login with valid credentials
    Given I am on Homepage
    When I login with positive credentials
    Then the system should navigate to my accounts page