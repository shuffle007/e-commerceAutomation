@regression
Feature: User Authentication on Automation Exercise

  Background:
    Given the browser is launched
    And Navigate to "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Register a new user and delete the account
    When I click on the "Signup / Login" button
    Then "New User Signup" should be visible
    When I enter name "John Smith" and email "jsmith@go.dom"
    And I click on the "Signup" button
    Then "ENTER ACCOUNT INFORMATION" should be visible
    When I fill in the account details:
      | Title | Name       | Email       | Password    | Date of birth  |
      | Mr    | John Smith | jsmith@go.dom | password123 | 2-August-1995 |
    And I select the checkboxes for newsletters and special offers
    And I fill in the personal details:
      | First name | Last name | Company | Address               | Address2         | Country       | State       | City       | Zipcode | Mobile Number |
      | Peter      | Dean      | Library | 452 Mind Ya Business  | 542 For Real St. | United States | Your-Anus   | Zombieland | 12220   | 212-542-222   |
    And I click on the "Create Account" button
    Then "ACCOUNT CREATED!" should be visible
    When I click on the "Continue" button
    Then "Logged in as John Smith" should be visible
    When I click on the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And I click on the "Continue" button

  Scenario: Login user with correct email and password and delete the account
    When I click on the "Signup / Login" button
    Then "Login to your account" should be visible
    When I enter correct email address and password
      | Email          | Password    |
      | j2smith@go.po  | password123 |
    And I click on the "Login" button
    Then "Logged in as john smith" should be visible
    When I click on the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible

  Scenario: Login user with incorrect email and password
    When I click on the "Signup / Login" button
    Then "Login to your account" should be visible
    When I enter incorrect email address and password
      | Email          | Password    |
      | jsmith@go.po   | password123 |
    And I click on the "Login" button
    Then "Your email or password is incorrect!" should be visible

  Scenario: Logout user
    When I click on the "Signup / Login" button
    Then "Login to your account" should be visible
    When I enter correct email address and password
      | Email          | Password    |
      | j1smith@go.po  | password123 |
    And I click on the "Login" button
    Then "Logged in as john smith" should be visible
    When I click on the "Logout" button
    Then "Login to your account" should be visible

  Scenario: Register user with existing email
    When I click on the "Signup / Login" button
    Then "New User Signup" option should be visible
    When I enter name "John Smith" and already registered email "j1smith@go.po"
    And I click on the "Signup" button
    Then "Email Address already exist!" should be visible
