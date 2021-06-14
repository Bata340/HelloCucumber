Feature: Log into a buying system
  As a customer
  I want to login with username and password
  In order to buy some things in the website I am logging into.

  Background:
      Given we are a customer

  Scenario: Log in correctly
    When we want to login with our username and password correctly
    Then our password and username are correctly validated

  Scenario: Log in with bad username
    When we want to login with our username wrongly
    Then our username is not validated correctly

  Scenario: Log in with bad password
    When we want to login with our password wrongly
    Then our password is not validated correctly