Feature: Main page tests

  Background:
    Given Browser is open



  Scenario: Add to cart
    When I click add to cart button
    Then I check if color of information div after adding is "rgba(228, 251, 159, 1)"
