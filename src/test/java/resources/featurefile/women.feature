@regression
Feature: Women Test
  As a user I want to products by price and products names

  @smoke
  Scenario: User should sort the products by name filter successfully
    Given I am on home page
    When I mouse Hover on Women Menu
    And I mouse Hover on Tops
    And I click on Jackets
    Then I verify the products name display in alphabetical order

  @sanity
  Scenario: User should sort the products by name filter successfully
    Given I am on home page
    When I mouse Hover on Women Menu
    And I mouse Hover on Tops
    And I click on Jackets
    Then I verify the products price display in low to high