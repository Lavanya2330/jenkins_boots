Feature: filter By Price
  As a end user
  I want to search a product and filter within a price range
  So that I should be able to see the relevant products within the price range
@smoke
  Scenario: filter by price
    Given I am on Homepage
    When I want to search for an product "baby food"
    And I filter the products within a price range
    Then I should see the products within the price range