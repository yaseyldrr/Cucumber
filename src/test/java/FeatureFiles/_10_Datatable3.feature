Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country

  Scenario: Create a Country

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | yaseWorld1 |
      | codeInput | yaseCode1  |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed