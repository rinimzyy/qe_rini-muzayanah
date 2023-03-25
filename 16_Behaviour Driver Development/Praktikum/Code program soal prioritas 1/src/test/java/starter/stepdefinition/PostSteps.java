package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.Post;

public class PostSteps {
    @Steps
    Post post;

    @Given("I am on the post tab")
    public void onPostTab(){
        post.onPostTab();
    }
    @When("I write something about my activity")
    public void writeMyActivity(){
        post.writeMyActivity();
    }
    @And("I click post button")
    public void clickPostButton(){
        post.clickPostButton();
    }
    @Then("My network can see my activity")
    public void seeMyActivity(){
        post.seeMyActivity();
    }
}
