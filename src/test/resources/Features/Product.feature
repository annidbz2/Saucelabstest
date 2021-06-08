Feature: ProductSauceLabssername

@test
Scenario Outline: Complete purchase flow

Given user login to application with <"username"> <"password">
And user search for <"product"> and add it into cart
And click on add cart button
And user clicks on checkout button
And user enters <"firstname"> <"lastname"> <"postalcode">
And click on continue button
And user scrolls down and click on Finish button
Then verify that proper message is displayed for the purches low
And user goes back to home page

Examples:
 |username     |password   |product            |firstname |lastname |postalcode|
 |standard_user|secredsauce|Sauce Labs Backpack|Anirudha  |agnihotri|474001    |