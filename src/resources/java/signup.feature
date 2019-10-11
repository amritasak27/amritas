Feature: Sign up details
Scenario: Registration
Given User is on homepage
And Click on signup link
Then Registration page is displayed
And User enters username as "Amrita123"
And User enters firstname as "Amrita"
And User enters lastname as "Sharma"
And User enters password as "amrita234"
And User confirms password as "amrita234"
And User selects gender
And User enters email as "abcd@gmail.com"
And User enters mobile number as "9876567890"
And User enters date of birth as "11-01-2003"
And User enters address as "Sholinganallur"
And User selects security question 
And User enters answer as "red"
Then Click on Register
