Feature: Datatable Example

  Scenario: User List
    When Write username "yase"
    When Write username and password "yase" and "1234"

    And Write username as Datatable
      | yase   |
      | ismet  |
      | şükran |
      | emir   |
      | kadir  |

    And Write username and password as Datatable
      | yase   | 125   |
      | ismet  | 2345  |
      | şükran | 1245  |
      | emir   | 12345 |
      | kadir  | 1235  |

    # DataProvider (TestNG), Senaryo Outline (Cucumber)
    # Görevi verilen her değer için, tüm senaryo çalışır

    # Datatable ise sadece bir step e çoklu paramtere vermek
    # için kullanılır, sadecebir kez tüm parametreleri stepin içine atar