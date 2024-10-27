Feature: ApachePOI Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Citizenship

  Scenario: Create and Delete Citizenship from Excel
    When User creates a citizenship with ApachePOI
    When User deletes a citizenship with ApachePOI
    Then Success message should be displayed