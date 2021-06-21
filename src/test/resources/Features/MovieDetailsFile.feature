Feature: search movie by name and get plot and cast of movie

Scenario Outline: find movie cast and movie plot

Given enter movie name <movieName1>  by user
When pick one option from suggestions
And hit on casting link
Then hit on plot summary link

Examples:
|movieName1|
|Fukrey|