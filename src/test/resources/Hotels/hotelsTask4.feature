Feature: Test Feature
  Scenario: Verify destination error displayed if search with no destination
    Given I launch Hotels website
    When I click search button
    Then I verify if the destination box is displayed

  Scenario: I try cucumber
    Given I launch Hotels website
    When I click the travelers box
    And I select child traveler
    Then I verify the age error is displayed
    And I select age in the age-box
    Then I verify the age error is not displayed
    And I click done button
    And I type destination
    And I select destination
    And I click search button
    Then verify numbers of travelers before and after is the same