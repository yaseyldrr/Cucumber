Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Citizenship

  Scenario Outline: Create a Citizenship with parameter

    When Create a Citizenship name as "<name>" shortcode as "<shortcode>"
    Then Success message should be displayed
    When Create a Citizenship name as "<name>" shortcode as "<shortcode>"
    Then Already exist message should be displayed
    When Delete a Citizenship name as "<name>"
    Then Success message should be displayed

    Examples:
      | name    | shortcode  |
      | ys45yy5 | ydsa8723y4 |
      | ys45yy6 | ydsa8723y3 |
      | ys45yy7 | ydsa8723y2 |
      | ys45yy8 | ydsa8723y1 |
      | ys45yy9 | ydsa8723y0 |