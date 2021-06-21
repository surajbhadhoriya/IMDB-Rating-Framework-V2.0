Feature: To test login functionality

Scenario Outline: Login Successful
Given user navigate to website and click on signin button
When select option for signin with IMDB
And Enter valid credentials <username> and <password>
Then login must be successful

Examples:
|username|password|
|bhadhoriya.02@gmail.com|Suraj@12345|
