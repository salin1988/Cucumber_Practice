Feature: Create account of Facebook
As a user u need to open facebook home page and do the validation

Scenario: Validate First Name field
Given User need to be on facebook login page
When User enters user first name
Then User checks user first name is present

#Scenario: Validate create user multiple fields
#Given User need to be on facebook login page
#When User enters user first name
#And User enters user surname
#Then User checks user first name is present
#But User Mobile field should be blank