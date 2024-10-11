#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.

Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario: Create a Citizenship with parameter 1
    When Create a Citizenship name as "yas12CS121" shortcode as "yy2sk121"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter 2
    When Create a Citizenship name as "yas12CS456" shortcode as "yy2sk566"
    Then Success message should be displayed
