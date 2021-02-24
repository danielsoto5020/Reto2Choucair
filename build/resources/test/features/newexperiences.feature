@stories
Feature: NewExperiences

  As a user I want to enter the NewExperience page to buy the T-Shirt

  @scenario1
    #Cambiar Data antes de ejecutar
  Scenario: buy an T-Shirt in the pag new experience

    Given than ana wants to enter the page new experience
    When create account and search the T-shirt in the New Experience
      | email                | first_Name | last_name | password | day | month | year | address | city    | state | postal_code | mobile_phone | address3 |
      | lana13@hotmail.com | Ana  | Arbelaez    | lana1234 | 18   | 6     | 1995 | Street  | Houston | 31    | 07636       | 32467256     | Street5 |

    Then She finds the T-Shirt called Faded Short Sleeve T-shirts
      | message                             |
      | Your order on My Store is complete. |