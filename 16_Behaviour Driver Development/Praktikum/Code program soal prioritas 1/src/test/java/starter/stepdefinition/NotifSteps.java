package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Notif.Notif;


public class NotifSteps {
    @Steps
    Notif notif;

    @Given("I am on my Linkdin Dashboard")
    public void onTheDashboard(){
        notif.onTheDashboard();
    }

    @When("I click notification button")
    public void clickNotification(){
        notif.clickNotification();
    }
    @Then("I can see my notification")
    public void seeMyNotification() {
        notif.seeMyNotification();
    }

}
