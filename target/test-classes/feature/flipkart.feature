Feature: Feature containing flipkart sorting functionalities

@Flipkart
Scenario: Sorting functionalities of flipkart

Given User launches chrome and navigates to flipkart
When  User enters "iphone" and clicks search 
When  user clicks price-low to high
And User compares
Then user compares the sorting result with the last mobile price 
