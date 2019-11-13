Feature: Testing the login feature

#Background:
#Given the user has loaded the application in the browser
#When the user enters the valid username
#
#Scenario: Testing the login Feature with Valid Data
#And the user enters the valid password
#And the user clicks on the login button
#Then the dashboard page must be  displayed
#
#Scenario: Testing the login Feature with Invalid Data
#And the user enters the invalid password
#And the user clicks on the login button
#Then the user should be in the same page

Scenario: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enters "admin" in the username textbox
And the user enters "manager" in the password textbox
And the user clicks on the login button
Then the dashboard page must be  displayed

Scenario Outline: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enters "<username>" in the username textbox
And the user enters "<password>" in the password textbox
And the user clicks on the login button
Then the dashboard page must be  displayed

Examples:
|username|password|
|admin|manager|
|trainee|trainee|

Scenario: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enters username in the username textbox
|admin|trainee|
|admin2|trainee2|
And the user enters password in the password textbox
|manager|
And the user clicks on the login button
Then the dashboard page must be  displayed