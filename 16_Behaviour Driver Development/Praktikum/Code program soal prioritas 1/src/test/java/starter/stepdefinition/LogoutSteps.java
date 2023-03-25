package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.logout.Logout;

public class LogoutSteps {

    @Steps
    Logout logout;

    @Given("I already login to my account")
    public void alredyLogin(){
        logout.alreadyLogin();
    }
    @When("I click signout button")
    public void clickSignout(){
        logout.clickSignout();
    }
    @Then("I can logout from my account")
    public void logout(){
        logout.logout();
    }
}
