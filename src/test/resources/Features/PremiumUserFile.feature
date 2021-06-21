Feature: premium user search movie and get require details

Scenario Outline: premium user get movie cast and movie plot

Given click on ImdbPro version
And select appropirate option for login
When enter username <userName> and password <password> and hit on login button
And get in movie <movieName> name which user want to search
When select particular option from suggestions
And click on cast and crew link of movie
Then click on plot summary of movie

Examples:
  |username|password|moviename|
  |bhadhoriya.02@gmail.com|Suraj@12345|Dangal|