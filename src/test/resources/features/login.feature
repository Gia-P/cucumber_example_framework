@web @regression @name
  # Created by Gia Pachkhatashvili
Feature: Name feature

  Background:
    Given I am on Home Page

  @name
  Scenario: Verify Invalid Login
    When I enter email@test.com into username text fields on home screen
    And I enter test1234 into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am on invalid login page