Feature: Hotels homepage
 Background:
  Given I launch Hotels website

 Scenario: Verify user can update number of guests on Home page
  When I click the travelers box
  And  I select 6 Adults traveler
  And  I select child traveler
  And  I select age in the age-box
  And  I select second child age under 1
  And  I click done button
  Then Verify total number of guests in sum of adults and children as same as selected on step #3 and #4.