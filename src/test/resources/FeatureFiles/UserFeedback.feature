@regression
Feature: User Feedback

  Background: 
    Given the browser is launched
    And Navigate to "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: User submits the 'Contact Us' form successfully
    When I click on the "Contact us" button
    Then "GET IN TOUCH" should be visible
    When I fill the contact form with:
      | Name       | Email        | Subject  |  | Message        |
      | John Smith | jsmith@go.po | Feedback |  | Great website! |
    And I upload a file "/Users/shafiulahmed/Documents/UpSkill/API/students.json"
    And I click on the "Submit" button
    And I click on the "OK" button
    Then "Success! Your details have been submitted successfully." should be visible
    When I click on the "Home" button
    Then the home page should be visible successfully

  Scenario: User submits a review on a product
    When I click on the "Products" button
    Then I should be navigated to the "ALL PRODUCTS" page successfully
    When I click on the "View Product" button
    Then "Write Your Review" should be visible
    When I enter user details:
      | Name | Email         | Review     |
      | john | j3smith@go.po | good stuff |
    And I click on 'Submit' button
    Then "Thank you for your review." should be visible
