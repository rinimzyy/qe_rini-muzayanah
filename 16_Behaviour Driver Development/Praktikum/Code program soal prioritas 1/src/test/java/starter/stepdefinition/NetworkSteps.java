package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.network.Network;

    public class NetworkSteps {
        @Steps
        Network network;

        @Given("I am on the network page")
        public void onNetworkPage(){
            network.onNetworkPage();
        }
        @When("I click follow button on people account")
        public void clickFollow(){
            network.clickFollow();
        }
        @And("My request is accepted")
        public void acceptRequest(){
            network.acceptRequest();
        }
        @Then("I can see their activity")
        public void seeActivity(){
            network.seeActivity();
        }
    }
