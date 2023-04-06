package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.About;
import starter.login.Home;
import starter.login.Login;

public class AboutSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Steps
    About about;

    @Given("I successfully login")
    public void successLogin(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
        login.inputUsername("standard_user");
        login.inputPassword("secret_sauce");
        login.ClickLoginButton();

    }
    @When("I am on the web home page")
    public void enterValidUsername(){
        home.validateOnTheHomePage();
    }
    @And("I click list menu button")
    public void ClickMenuButton(){
        about.ClickMenuButton();
    }
    @And("I click About button")
    public void ClickAboutButton(){
        about.ClickAboutButton();
    }
    @Then("I can see web details")
    public void detailsPagee(){
        about.detailsPage();
    }
}
