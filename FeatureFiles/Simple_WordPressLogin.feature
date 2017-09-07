Feature: Smoke test for WordPress login page
	Scenario: Test login with valid credentials
  Given Open wordpress application in chrome browser
	When I enter valid username and password
	Then I must successfully land on Dashboard page