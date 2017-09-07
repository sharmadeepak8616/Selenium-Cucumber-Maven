Feature: Smoke test for WordPress login Page by passing parameters


Scenario: Test login with valid credentials passed as parameters
Given Open wordpress application in "Chrome" browser
When I enter valid "admin" and "demo123"
Then must successfully land on Dashboard page
