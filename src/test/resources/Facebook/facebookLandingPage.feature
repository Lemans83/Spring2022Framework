Feature: login

  Scenario: Facebook
    Given I launch Facebook
    When I click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
    Then I close all windows except Instagram
    And I quit windows
