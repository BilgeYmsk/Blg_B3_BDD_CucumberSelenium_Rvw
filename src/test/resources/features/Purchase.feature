Feature: the user should be able to place order from the website

  Background:
    Given the user is on the login page

  @purchase
    Scenario: Placing successful order
      When the user enters "blg" and "Test1234!" and click login button
      And the user adds "Samsung galaxy s7" from "Phones"
      And the user adds "MacBook air" from "Laptops"
      And the user adds "Sony vaio i5" from "Laptops"
      And the user adds "Apple monitor 24" from "Monitors"
      And the user remove "Sony vaio i5" from cart
      And the user places order captures and log amount
      Then the user verifies puchase amount equals 1900


