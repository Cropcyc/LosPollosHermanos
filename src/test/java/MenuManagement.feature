Feature: Menu Management for Los Pollos Hermanos restaurant

  Scenario: Add a menu item
    Given I have a menu item named "Pollos Wings Meal", which is a "Rice, beans and chicken meal" with price 15
    When I add the menu item
    Then Menu item named "Pollos Wings Meal" is added
