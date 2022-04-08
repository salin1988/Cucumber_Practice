Feature: Create account of Facebook
As a user u need to open facebook home page and do the validation

Background: Common step
Given User need to be on facebook login page

Scenario: Validate First Name field
When User enters user "Salin" first name
Then User checks user "Salin" first name is present

Scenario: Validate create user multiple fields
When User enters user "Saraswati" first name
And User enters user "Dalabehera1" surname 
Then User checks user "Saraswati" first name is present
And User checks user "Dalabehera1" last name is present