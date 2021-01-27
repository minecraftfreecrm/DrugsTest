@drugs @regression
Feature: Users ability to create account 

@Sprint
Scenario Outline: User should able to create account using Register 

	Given Browse to drugs homepage
	When Navigate to Register page 
	And Fill form with some basic information 
	And Complete creating account with "<Username>" with "<Password>"
	Then Verify account created successfully 
	
	Examples: 
		|Username  | Password |
		|momukit   | mukit123 |