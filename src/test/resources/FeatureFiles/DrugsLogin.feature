@drugs @regression 
Feature: Users ability to login 

@Sprint1
Scenario Outline: User should able to login using Sign-On Feature 

	Given Land to drugs.com homepage 
	When Navigate to Sign-On page 
	And Fill login form with valid username and password 
	And Click login button 
	Then Verify login successfully 
	
	Examples: 
		|UserName |
		|Mincraft  |