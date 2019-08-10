Feature: Test Facebook smoke scenario 

Scenario Outline: Test login with valid credentials 
	Given Open firefox and start application 
	When I enter valid "<username>" and "<password>" 
	Then user should be able to login successfully 
	Then application should be closed
	
	
	Examples: 
		| username | password |
		| kanth2810 | mysonwithme@2019 |
