@regression
Feature: Shopping Cart
  This feature covers adding, verifying, and removing products from the shopping cart.

  Background: 
    Given the browser is launched
    And Navigate to "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Add Products in Cart
    When I click on the "Products" button
    And I hover over the first product and click 'Add to cart'
    And I click on the "Continue Shopping" button
    And I hover over the second product and click 'Add to cart'
    When I click on the "Cart" button
    Then I should see both products added to the cart
    And I should verify their prices, quantity, and total price

  Scenario: Verify Product quantity in Cart
    When I click on the "Products" button
    And I click on the "View Product" button
    And I increase the quantity to 4
    And I click on the "Add to cart" button
    And I click on the "Continue Shopping" button
    And I click on the "Cart" button
    Then I should verify the product is displayed in the cart with the exact quantity

  Scenario: Remove Products From Cart
    When I add products to the cart
    And I click on the "Continue Shopping" button
    And I click on the "Cart" button
    Then I should see the cart page displayed
    When I click the 'X' button for a product
    Then I should see the product removed from the cart
    
   Scenario: Search Products and Verify Cart After Login
    When I click on the "Products" button
    Then I should see the "ALL PRODUCTS" page visible
    When I enter "Top" as the product name in the search input and click the search button
    Then "SEARCHED PRODUCTS" should be visible
    And I should verify all products related to the search "Top" are visible
    When I add those products to the cart
    And I click on the "Cart" button
    Then I should verify the products in the cart
    When I click on the "Signup / Login" button
    And I enter correct email address and password
      | Email          | Password    |
      | j2smith@go.po  | password123 |
    And I click on the "Login" button
    Then I should verify the products are still visible in the cart after login
    
   Scenario: Add to Cart from Recommended Items
    When I scroll to the bottom of the page
    Then I should see the "RECOMMENDED ITEMS" visible
    When I click "Add To Cart" on a recommended product
    And I click on the "View Cart" button
    Then I should verify the product is displayed in the cart
    
    
    