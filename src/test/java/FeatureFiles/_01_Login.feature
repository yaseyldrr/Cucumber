  # Login function control
  # Navigate to the site (driverGet)
  # Enter the login infos(username password sendKeys)
  # Then verify login process (Verify, Assert)

    #İşte Gherkin dilinde kullanılan bazı anahtar kelimelerin Türkçe karşılıkları:
    #
    #1-Feature → Özellik
    #Yazılımın test edilmesi gereken genel bir özelliğini tanımlar.
    #Scenario → Senaryo
    #
    #Bir özelliğin belirli bir kullanım durumunu test eden bir senaryo tanımlar.
    #Given → Diyelim ki / Varsayalım ki
    #
    #Testin başlama noktasını veya senaryonun ön koşullarını tanımlar.
    #When → Eğer / Ne zaman ki
    #
    #Senaryonun tetikleyici bir eylemini veya davranışını tanımlar.
    #Then → O zaman / Sonuç olarak
    #
    #Senaryonun sonucunu veya beklenen çıktısını tanımlar.
    #And → Ve
    #
    #Aynı aşamada ek şartları belirtir.
    #But → Fakat / Ama
    #
    #Aynı aşamadaki bir istisnai durumu belirtir.


Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

