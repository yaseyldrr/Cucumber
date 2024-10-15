#Cities menusunun kayıt,
#Tekrar Aynı Kayıt(Negatif test) ve silme özelliğini test ediniz

Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Cities Functionality and Delete

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | cities     |

    And Click on the element in Dialog
      | addButton     |
      | countrySelect |
      | uruguay       |

    And User sending the keys in Dialog
      | countryName | yaseCity |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deletes the element from Dialog
      | yaseCity |

    Then Success message should be displayed
