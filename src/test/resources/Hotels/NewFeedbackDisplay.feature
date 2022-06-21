Feature: Verify feedback form on Hotels
  Background:
    Given I launch Hotels website

  Scenario: Verify error is displayed when user submits the empty feedback form
#    Given I launch Hotels website
    When  I click Sign in link
    When  I select Website feedback from Help dropdown
    And   I click submit button
    Then  Verify error message is displayed Please fill in the required information highlighted below.
    Then  Verify star boxes section is in a red dotted box.

  Scenario: Verify Share feedback button is displayed at the end of search results
    When  I type destination
    And   I select destination
    And   I select August 1-10, 2022 from calendar
#    And   I select August 1, 2022 as Check-in
#    And   I select August 10, 2022 as Check out
    And   I click search button
    Then  I verify the text Tell us how we can improve our site is displayed
    Then  I verify the button share feedback is displayed and enabled

  @TC25
  Scenario: Verify user can submit feedback after completing the feedback form
  When I click Sign in link
  And I select Website feedback from Help dropdown
  And Select any star-rating
  And I enter any comments Karimashvili
  And I Select any option for “How likely are you to return to Hotels.com?
  And Select any answer for Prior to this visit, have you ever booked on Hotels.com?
  And Select any answer for Did you accomplish what you wanted to do on this page?
  And I click on Submit button
  Then Verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed