Feature: AddtoCart Product

  Scenario: User add cart dress product item
    When User click product dress item
    And User choose product dress color
    And User choose product dress size
    And User click button add cart on dress product
    And User click icon cart for dress view
    Then User click icon cart for dress view
