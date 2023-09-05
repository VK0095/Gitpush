Feature: Limeroad Order

  Scenario: To click on shop men button
    Given Launch url"https://www.limeroad.com/";
    When User clicks on shop men

  Scenario: User select the product
    Given User clicks on the T-shirt
    When User Select brand of Kanikacrystal
    And User Select tshirt color purple
    And User Select size 2XL
    And User add the tshirt to the Cart
