Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country

  Scenario: Citizenship Create and Delete

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

    And User deletes the element from Dialog
      | yaseWorld1 |

    Then Success message should be displayed

  Scenario: Create Natioanlity and Delete

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | countryName | yaseWorld1 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User deletes the element from Dialog
      | yaseWorld1 |

    Then Success message should be displayed


  Scenario: Fee Functionality and Delete

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | countryName     | isFee42123 |
      | countryCode     | 1736612    |
      | integrationCode | 1221       |
      | priorityCode    | 45555561   |

    And Click on the element in Dialog
      | toggleBar |
      | saveClose |

    Then Success message should be displayed

    And User deletes the element from Dialog
      | isFee2123 |

    Then Success message should be displayed





