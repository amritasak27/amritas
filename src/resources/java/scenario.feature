Feature: Product
Background: User Login
Given User is on login page
When User enters valid credentials and performs login
Then User must be navigated to the home page of TestMeApp
Scenario: Search product
Given Alex should be on home page
When Alex enters the first four letters of the product
And Selects the product from list and clicks on find details
And Alex is redirected to the product page
And Add the product to cart
And Select cart link
And Navigate to view cart
And Checkout
And Proceed to pay
And Navigate to payment page
And Payment Gateway
And Order Details
Then Signout

Scenario: Unsuccessful search
Given Alex should be in home page
When Alex enters the first four letters
Then No message displayed