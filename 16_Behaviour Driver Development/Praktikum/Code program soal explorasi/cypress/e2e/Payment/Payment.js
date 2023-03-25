import {Given , When, And, Then} from "cypress-cucumber-preprocessor/steps";

Given ("I am on the payment page",function(){
    console.log("On the payment page")
});
When ("I choose payment method example Dana",function(){
    console.log("Choose payment method")
});
And ("I click pay button",function(){
    console.log("Click pay button")
});
Then ("Redirected to Dana application",function(){
    console.log("Redirect to Dana app")
});
