#CitizenShip menusunun kayıt ve silme özelliğini
#(DataTable ile) 5 farklı değer seti ile çalıştırınız.

Feature: Datatable Functionality Datatable

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country

  Scenario Outline: Citizenship Create and Delete

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | citizeship |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | countryName | <name>  |
      | countryCode | <short> |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deletes the element from Dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name       | short     |
      | yasdawd    | grgd      |
      | wesfgr     | setr4ertg |
      | 3454tgfre  | fdgdffg   |
      | awdwefeg   | u7ıjtfh   |
      | fshgdrhhdd | 35354     |


