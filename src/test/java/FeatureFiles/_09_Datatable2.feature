Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country

  Scenario: Create a Country

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |
