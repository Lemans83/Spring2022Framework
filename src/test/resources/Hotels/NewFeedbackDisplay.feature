Feature: Verify feedback form on Hotels
  Scenario: Verify error is displayed when user submits the empty feedback form
    Given I launch Hotels website
    When  I click Sign in link
    When  I select Website feedback from Help dropdown
    And   I click submit button
    Then  Verify error message is displayed Please fill in the required information highlighted below.
    Then  Verify star boxes section is in a red dotted box.


  Scenario: Verify Share feedback button is displayed at the end of search results
    Given I launch Hotels website
    When  I type destination
    And   I select destination
    And   I select August 1, 2022 as Check-in
    And   I select August 10, 2022 as Check out
    And   I click search button
    Then  I verify the text Tell us how we can improve our site is displayed
    Then  I verify the button share feedback is displayed and enabled