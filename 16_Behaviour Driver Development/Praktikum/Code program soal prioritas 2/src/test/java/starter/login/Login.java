package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on the login page")
    public void onTheLandingPage(){
        System.out.println("I am on the login page");
    }
    @Step("I enter my username and password")
    public void enterUsernameAndPassword(){
        System.out.println("I enter my username and password");
    }
    @Step("I click login button")
    public void clickLoginButton(){
        System.out.println("I click login button");
    }
    @Step("I am on the home page")
    public void onTheHomePage(){
        System.out.println("I am on the homepage");
    }

}
