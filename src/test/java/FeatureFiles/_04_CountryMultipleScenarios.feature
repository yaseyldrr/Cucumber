Feature: Country Functionality

  Background: #Before Scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

  Scenario: Create a Country
    When Create a country
    Then Success message should be displayed

    # fonksiyonlara parametre gönderilebilir
  Scenario: Create a Country 2
    When Create a country name as "Country1Ys1" code as "Country2YsKod2"
    Then Success message should be displayed