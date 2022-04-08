Feature:  Validate the users

Scenario: Check the username and surname
Given User need to be on facebook login page
When User enters user <firstName> first name
And User enters user <lastName> surname
Then User checks user <firstName> first name is present
And User checks user <lastName> last name is present
Example:
    |firstName |lastName|
    |Salin     | Dalabehera|
    |Saraswati | Dalabehera| 
