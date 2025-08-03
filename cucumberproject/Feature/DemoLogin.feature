Feature: Demo Web Shop11 login testing
Scenario: To check login with valid username and valid password credentials

Given user is to be on login page
Then user enters valid username as "<username>" and valid password as "<password>"
And clicks on loginn button
Then navigating to home page
Then clicking on logout button

Examples:
|username|password|
|reqs12@gmail.com|abcdef|
|pqrs13@gmail.com|abcdef|

