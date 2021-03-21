
Feature: Yahoo signup test version 1

Scenario: Valadating yahoo sign up page 

Given user is on the  yahoo sign up page 
When user enters first name 
And user enters last name 
And user enters new email address 
And user enter new password 
Then user should see the values in the text boxes 
