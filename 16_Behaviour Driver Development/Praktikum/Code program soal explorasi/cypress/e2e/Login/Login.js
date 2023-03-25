import {Given , When, And, Then} from "cypress-cucumber-preprocessor/steps";

Given ("I am on the login page",function(){
    console.log("On the login page")
});
When ("I enter my username and password",function(){
    console.log("Enter username and password")
});
And ("I click login button",function(){
    console.log("Click login button")
});
Then ("I am on the home page",function(){
    console.log("Successfully login")
});
