Feature: Login details
Scenario Outline: Login
Given User is on home page
When User performs login using "<username>" and "<password>"
Then User is logged in successfully
Examples:
| username || password |
| lalitha || Password123 |