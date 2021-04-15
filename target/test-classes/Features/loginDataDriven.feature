Feature: Login Functionality with data driven 

Scenario Outline: Invalid Login and message validation

Given User navigates to the login page
When User enters "<Username>" and "<Password>"
And  User click on the login button
Then User See the "<ErrorMessage>"

Examples:
|Username        |Password   | ErrorMessage   |
|Admin           | Admin     | Invalid credentials|
|Admin12         | Admin123  | Invalid credentials|
|                | Admin123  |Username cannot be empty|
|Admin           |           |Password cannot be empty|

@Smoke
Scenario: Login with invalid Credentials

When User enters invalid Usernmae and invalid password and see error message
|Username        |Password   | ErrorMessage   |
|Admin           | Admin     | Invalid credentials|
|Admin12         | Admin123  | Invalid credentials|
