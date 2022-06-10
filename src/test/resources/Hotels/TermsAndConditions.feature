Feature: TermsAndConditions on Hotels webpage
  Background:
    Given I launch Hotels website

  Scenario: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
    When  I click Sign in link
    And   I click Sign up link
    And   I click Terms and Conditions link
    Then  I verify Terms and Conditions page opens in a tab
    And   I click Privacy Statement link
    And   I verify Privacy Statement page opens in a tab


