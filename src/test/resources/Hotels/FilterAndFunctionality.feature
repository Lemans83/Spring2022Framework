Feature: Hotels
Background:
  Given I launch Hotels website

  Scenario: Verify filter-by and sort-by functionality works as expected

    When I select destination Manhat
    And I select destination from suggestion
    And I select August 10-15, 2022 from calendar
    And I click search button
    And Click on 5 from star-rating filter
    And Select Price from sort-by dropdown
    Then I verify all hotels in search results are *-rated as selected in above step
    Then I verify all hotels are listed in increasing order price
