Feature: Verification Message Sign-in Page
  Background:
    Given I launch Hotels website

  Scenario: Hotels: Verify Verification message for invalid sign in credentials
  When  I click Sign in link
  And   I click Sign in button
  And   I enter invalid email address Ghozali@list.ru
  And   I enter invalid password 5%%%%%%
  And   I click sign in button
  Then  I verify that the verification message is displayed

