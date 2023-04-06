package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.sepulsa.com/signin");
        login.validateOnLoginPage();
    }
    @When("I enter valid username")
    public void enterValidUsername(){
        login.inputUsername("rinimuzayanah0415@gmail.com");
    }
    @And("I enter valid password")
    public void enterValidPassword(){
        login.inputPassword("Bismilllah7.");
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }

    @Given("I am on the web login page")
    public void onTheWebLoginPage(){
        login.openUrl("https://www.sepulsa.com/signin");
        login.validateOnLoginPage();
    }
    @When("I enter invalid username")
    public void enterInalidUsername(){
        login.inputUsername("rinimuzayanah0415@gmail.co");
    }
    @And("I enter valid user password")
    public void enterValidUserPassword(){
        login.inputPassword("Bismilllah7.");
    }
    @And("I click the login button")
    public void clickTheLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I am have error message")
    public void warningMessage(){
        login.warningMessage();
    }
}
