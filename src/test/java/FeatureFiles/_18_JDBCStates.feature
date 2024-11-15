#Senaryo: States menüsünde gelen ilk 10 verinin DB deki data ile aynı olup olmadığını kontrol ediniz.

  Feature: Testing JDBC States
    Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

      Scenario: Testing with JDBC
        And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |
        Then Send the Query the Database "select name from states limit 10" and control match
