Feature: Verification Message Sign-in Page
  Background:
    Given I launch Hotels website
    When I click Sign in link

  Scenario: Hotels: Verify Verification message for invalid sign in credentials
  And   I click Sign in button
  And   I enter invalid email address Ghozali@list.ru
  And   I enter invalid password 5%%%%%%
  And   I click sign in button
  Then  I verify that the verification message is displayed


 @TC22
 Scenario: Verify error message for invalid data in SignUp form
   And I click Sign up link
   When I enter invalid signup email address #!@###
   And  Enter invalid first name (!@)
   Then I verify error is displayed
   And  Enter invalid last name (%^&)
   And Enter password Mam83
   Then Verify error is displayed
   Then Verify “Keep me signed in” checkbox is displayed and enabled
   Then Verify “Continue” button is displayed but NOT enabled