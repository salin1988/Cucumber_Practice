Feature: Create account of Facebook
As a user u need to open facebook home page and do the validation

Scenario: Validate First Name field
Given User need to be on facebook login page
When User enters user "Salin" first name
Then User checks user "Salin" first name is present

Scenario: Validate create user multiple fields
Given User need to be on facebook login page
When User enters user "Salin" first name
And User enters user "Dalabehera" surname 
Then User checks user "Salin" first name is present
And User checks user "Dalabehera" last name is present