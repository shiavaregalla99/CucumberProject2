Feature: Login Functionality
Background: 
Given User navigates to the login page

@Smoke
Scenario: Login into the application with valid credentails


When User enters the valid username and valid password
And  User click on the login button
Then User Successfully login into the application
@Regression
Scenario: Login into the application with invalid username

When User enters the invalid username and valid password
And  User click on the login button
Then User unable login into the application

@Regression
Scenario: Login into the application with invalid password

When User enters the valid username and invalid password
And  User click on the login button
Then User unable login into the application

@Regression
Scenario: Login into the application with invalid credentials

When User enters the invalid username and invalid password
And  User click on the login button
Then User unable login into the application