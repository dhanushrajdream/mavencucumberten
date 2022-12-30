Feature: Checking the hotel booking functionality in the Adactin application

@SmokeTest
Scenario Outline: Login functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Key It Navigates To The Search Hotel Page

Examples:
|username|password|
|abc|123|
|xyz|456|
|nopassword|34567|
|dhanush5|dhanush5|
