Feature: Sum numbers
  As a user
  I want to sum numbers
  In order to know the result of the sum

  Background:
      Given we are a user

  Scenario: Sum two plus two
    When we want to know the result of two plus two
    Then the result is 4

  Scenario: Sum three plus three
    When we want to know the result of three plus three
    Then the result is 6

  Scenario: Sum four plus four
    When we want to know the result of four plus four
    Then the result is 8