Feature: feature to test google search functionality
Scenario: Validate google search is wroking
Given Browser is open
And user is google search page
When user enter a text in search box
And Hits enter
Then User navtigated to search results