Feature: Login to the Leaptap Application

Background: 
Given Launch the Chrome Browser
And Load the URL and Maximize

Scenario: Positive Login
Given Enter the username as 'DemoSalesManager'
And	Enter the password as 'crmsfa'
When Click on the Login button
Then Verify home page is displayed

Scenario: Negaive Login
Given Enter the username as 'Demouser'
And Enter the password as 'crmsfa1'
When Click on the Login button
Then Verify the error message is displayed


