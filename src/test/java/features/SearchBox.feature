Feature: SearchBox Functionality
#  SearchBox should Typeable where customer can enter valid product and select product to purchase
#  Target search box functionality should have a menu


#  Test Scenario/Scenario:
#  Test Case Design/ Scenario design: Step by step

  Background: Given user is landed on target homepage

  @RegressionTest @pending
  Scenario: SearchBox functionality should work with a valid product name
    And user enter valid product name
    When user click on search button
    Then user should see the valid product appears

#    Same approach in different way:

  @RegressionTest @pending
  Scenario: SearchBox functionality should work with a valid product name
    And user enter "Mask" valid product name
    When user click on search button
    Then user should see "Popular Filters" the valid product appears

#   For multiple product:

  @RegressionTest @pending
  Scenario Outline: SearchBox functionality should work with a valid product name using Scenario outline
    And user enter valid "<productName>" products name
    When user click on search button
    Then user should see the valid "<expectedProduct>" products appears

    Examples:
      | productName    | expectedProduct |
      | Mask           | Popular Filters |
      | Hand Sanitizer | Popular Filters |
      | Gloves         | Popular Filters |

# Same Approach with Data Table

  @RegressionTest
  Scenario: SearchBox functionality should work with a valid products name
    And user enter valid product name for search
      | product Name |
      | Mask         |
    When user click on search button
    Then user should see the valid product appears after search
      | Expected product Name |
      | Popular Filters       |
