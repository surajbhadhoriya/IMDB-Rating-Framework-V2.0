Feature: Suggestion of movie

Scenario Outline: To check option shown in suggesstion of given movie

Given enter movie <movieName> name which user want to search
When click on Enter button
Then verify movie option available in suggesstion

Examples:
 |movieName|
 |Ludo|
 