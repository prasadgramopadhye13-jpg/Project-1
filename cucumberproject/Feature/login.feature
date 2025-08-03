Feature: Demo Web Shop Login
 
 Scenario: Testing login functionality with valid credentials
 
 Given user is on login page
When user enters valid username and valid password 
Then click on login button
And navigates to home page
Then clicks on logout button  
 