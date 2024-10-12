#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Citizenship

  Scenario: Create a Citizenship with parameter
    When Create a Citizenship name as "yy12C67567" shortcode as "y455s78645661"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter (negative)
    When Create a Citizenship name as "675tgerg4" shortcode as "yy2s8657"
    Then Already exist message should be displayed

  Scenario: Delete the Previously Created Citizenship
    When Delete a Citizenship name as "675tgerg4"
    Then Success message should be displayed