Feature: Menu List

  Background:
    Given the user is on the login page


  Scenario: Verify Menu List1

#    open the https://www.demoblaze.com/
#  Log in (kendi kullaniciniz ile)
#  username ve password encrypted halde con.pro da bulunsun
#  Category den menusunde bulunan "Phone" "Laptops" "Monitors" lari verify et
#    When the user is on the login page
    Then the user able to see following categories
      | Phones   |
      | Laptops  |
      | Monitors |
#expected lar burada yaziliyor


  Scenario: Verify Menu List
    When User enters encrypted credentials
    Then the user able to see following categories
      | Phones   |
      | Laptops  |
      | Monitors |

  @wip2
    Scenario: Add new credential to the Configuration Properties
      Given the user is on the login page
      When the user enters valid credentials
      And the user get sony laptops name
      Then the compiler adds laptops name to the Configuration Properties

#      laptos yerine product yazarak asagiya tüm produklari example olarak yapinca sayfadaki tüm product lari alabilir.




