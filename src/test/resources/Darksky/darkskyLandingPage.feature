Feature: Darksky website

  Scenario: Verify the current date is highlighted in Time Machine's calendar
    Given I launch Darksky webpage
    When I scroll down to Time Machine button
    And I click the Machine Time button
    Then I verify if the current date is highlighted

  Scenario: Verify same values are displayed in the Today's data
    Given I launch Darksky webpage
    When I scroll down to Temperature bar
    And I click the the Temperture bar
    Then I verify if the values are displayed in Today's date

