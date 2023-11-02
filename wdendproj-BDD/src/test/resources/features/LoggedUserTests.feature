Feature: Logged user tests

  Scenario: Create new Account test
    Given Browser is open
    When I click account button
    And I fill registration email input with "test@test.test"
    And I fill registration password input with "QAZXSW123!@asdzxc"
    And I click registration button
    Then I am registered