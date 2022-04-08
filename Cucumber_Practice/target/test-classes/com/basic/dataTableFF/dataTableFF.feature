@Important
Feature: Create account of Facebook
As a user u need to open facebook home page and do the validation

Background: Common step
Given User need to be on facebook login page

@Smoke
Scenario: Validate create user multiple fields
When User enters user "Saraswati" first name
And User enters user "Dalabehera1" surname 
Then User checks user "Saraswati" first name is present
And User checks user "Dalabehera1" last name is present

@Smoke @Regression
Scenario: DataTable example
When Enter follwing data
    |userName |userLastName|
    |Salin    |Dalabehera|
    |Saraswati|Dalabehera|
 
Scenario: Validate create user multiple fields with dataTable
When User enters user "<userName>" first name
And User enters user "<userLastName>" surname 
Then User checks user "<userName>" first name is present
And User checks user "<userLastName>" last name is present
Examples: 
    |userName |userLastName|
    |Salin    |Dalabehera|
    |Saraswati|Dalabehera|


