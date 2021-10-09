Feature: Test the Welcome page
Scenario: Test the addition of tea
	Given user is on welcome page
	When user selects the "<teaname>" 
	And user clicks on Add button
	Then tea should get added