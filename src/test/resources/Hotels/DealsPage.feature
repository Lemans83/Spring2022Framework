Feature: Hotels Deals Page
  Background:
#    Given I launch Hotels website

  Scenario: Verify links on Deals page
    Given I launch Hotels.com/deals
#    When I click on more travel dropdown
#    And I click on Deals page link
    Then Verify “Manage your booking anytime, anywhere” is displayed and enabled
    Then Verify “Stay Flexible with free cancellation” is displayed and enabled
    Then Verify “Save on your next trip to the great outdoors” is displayed and enabled
    And  Click on Manage your booking anytime anywhere
    Then Verify “Search, book and Save on the go!” title is displayed
    And Go back
    And Click on Stay Flexible with free cancellation
    Then Verify “Amazing deals with free cancellation” OR “Stay Flexible with free cancellation” title is displayed
    And Go back
    And Click on Stay Flexible with free cancellation
    Then Verify “Amazing deals with free cancellation” OR “Stay Flexible with free cancellation” title is displayed
    And Go back
    And Click on “Save on your next trip to the great outdoors”
    Then Verify “Save on your next trip to the great outdoors” title is displayed
