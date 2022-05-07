Feature: Registration and User journey
  As a user I should be able to register on the site and i can able tp puurchase item successfully.

  Scenario Outline: Verify purchase of printed top from woman category as registered user and successfull checkout.
    Given I am on home page "http://automationpractice.com/index.php"
    When I enter search term "<searchTerm>"
    When I click on search button
    When I click on printed dress Image
    When I enter required quentity "<qty>"
    When I select size "<size>"
    When I click on addtocart button

    Examples:
    |searchTerm|qty|size|
    |top       |2  |M   |
