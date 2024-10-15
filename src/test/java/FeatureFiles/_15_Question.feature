#Inventory Bölümündeki
#Item Categories Çalışmasını test ediniz
#girişi yapıp , sonrasında silmesini yapınız
#Outline şeklinde yapınız

Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Country

  Scenario Outline: Inventory Category

    And Click on the element in LeftNav
      | setup          |
      | inventory      |
    #eklenecek inventory
      | itemManagement
   #eklenecek itemManagement

   #And Click on the element in Dialog
   #  | addButton |

   #And User sending the keys in Dialog
   #

   #And Click on the element in Dialog
   #  | saveButton |

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