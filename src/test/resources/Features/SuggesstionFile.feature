Feature: To click on Suggesstion

Scenario Outline: To test click on correct suggesstion

Given enter movie name <movieName> on search bar
When hit on enter button
And click on appropirate option in suggestion
Then verify click on correct option


Examples: 
   |movieName|
   |Inception|
   
