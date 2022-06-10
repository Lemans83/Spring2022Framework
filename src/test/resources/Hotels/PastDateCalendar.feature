Feature: Hotels Calendar
  Background:
    Given I launch Hotels website

  Scenario: Verify past date and back button on Current month's calendar is disabled
  When I click on Check-in Calendar
  Then Verify Past dates are disabled
  Then Verify Back button on current month is disabled
  And  Click on Done button on calendar
  And  Click on Checkout Calendar
  Then Verify Past dates are disabled
  Then Verify Back button on current month is disabled





