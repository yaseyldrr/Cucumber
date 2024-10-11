#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

Feature: Citizenship Functionality

  Scenario: Create a citizenship
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Citizenship
    When Create a citizenship
    Then Success message should be displayed