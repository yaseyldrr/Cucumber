#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature: Citizenship Functionality

  Background: #Before Scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "i7s11m12CS121" shortcode as "i2c112sk121"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter Negatif
    When Create a CitizenShip name as "i7s11m12CS121" shortcode as "i2c112sk121"
    Then Already exist message should be displayed

  Scenario: Delete Citizenship
    When user delete name as "i7s11m12CS121"
    Then Success message should be displayed


