import {Given , When, And, Then} from "cypress-cucumber-preprocessor/steps";

Given ("I am on the product page example pulsa",function(){
    console.log("On the product page")
});
When ("I enter my number",function(){
    console.log("Enter number")
});
And ("Product list is displayed",function(){
    console.log("List product displayed")
});
Then ("I click the product i want",function(){
    console.log("Click product")
});
And ("Redirected to the payment page",function(){
    console.log("Redirected to the payment page")
});