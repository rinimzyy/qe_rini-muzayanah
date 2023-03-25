package starter.stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.profile.Profile;

public class ProfileSteps {
    @Steps
    Profile profile;

    @Given("I am on the Linkdin Dashboard")
    public void onTheDashboard(){
        profile.onTheDashboard();
    }
    @When("I click my profile")
    public void clickMyProfile(){
        profile.clickMyProfile();
    }
    @Then("I can see my profile")
    public void seeMyProfile(){
        profile.seeMyProfile();
    }
}
