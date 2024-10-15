Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Cities Nationality and Delete

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | natioanlities     |

    And Click on the element in Dialog
      | addButton     |

    And User sending the keys in Dialog
      | countryCode | <name> |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deletes the element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name |
      | yase1 |
      | yase2 |
      | yase3 |
      | yase4 |